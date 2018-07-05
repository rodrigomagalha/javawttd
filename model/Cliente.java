@MappedSuperclass
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "R_E_C_N_O_")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recno;

	@Column(name = "A1_FILIAL")
	private String codigoFilial;

	@Column(name = "A1_COD")
	private String codigo;

	@Column(name = "A1_LOJA")
	private String loja;

	@Column(name = "A1_CGC")
	private String cip;

	@Column(name = "A1_NOME")
	private String nome;

	public String getCodigoFilial() {
		return codigoFilial;
	}

	public void setCodigoFilial(String codigoFilial) {
		this.codigoFilial = codigoFilial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}