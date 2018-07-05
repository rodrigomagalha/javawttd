public class ClientesImpl implements ClientesQueries {

	@Autowired
	private PaginacaoUtil paginacaoUtil;

	@PersistenceContext
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public Page<? extends Cliente> filtrar(Empresa empresa, ClienteFilter clienteFilter, Pageable pageable) {
		Criteria criteria = manager.unwrap(Session.class).createCriteria(EmpresaProtheus.valueOf(empresa.getEmpresaClass()).classeConverter("Cliente"));
		paginacaoUtil.preparar(criteria, pageable);
		adicionarFiltro(empresa, clienteFilter, criteria);
		return new PageImpl<>(criteria.list(), pageable, total(empresa, clienteFilter));

	}

	private Long total(Empresa empresa, ClienteFilter clienteFilter) {
		Criteria criteria = manager.unwrap(Session.class).createCriteria(ClienteBaesa.class);
		adicionarFiltro(empresa, clienteFilter, criteria);
		criteria.setProjection(Projections.rowCount());
		return (Long) criteria.uniqueResult();
	}
	
	private void adicionarFiltro(Empresa empresa, ClienteFilter cotacaoFilter, Criteria criteria) {
		
		EmpresaProtheus enumEmpresa = EmpresaProtheus.valueOf(empresa.getEmpresaClass());
		if(enumEmpresa .isExclusivo("Cliente")){
			criteria.add(Restrictions.eq("codigoFilial", empresa.getCodigoFilial()));
		}else{
			criteria.add(Restrictions.eq("codigoFilial", ""));
		}
	}

}