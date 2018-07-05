public interface ClientesQueries {
	
	public Page<ClienteBaesa> filtrar(Empresa empresa, ClienteFilter filtro, Pageable pageable);

}
