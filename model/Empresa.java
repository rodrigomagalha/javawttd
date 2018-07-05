@Entity
@Table(name = "pmt_empresa")
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@NotBlank(message = "Codigo da empresa do protheus é obrigatório")
	@Column(name = "codigo_protheus")
	private String codigoProtheus;

	private String nome;
	
	@Column(name = "nome_comercial")
	private String nomeComercial;

	@Column(name = "codigo_filial")
	private String codigoFilial;

	@Column(name = "nome_filial")
	private String nomeFilial;
	
	private String logo = "";
	
	private String css = "";
	
	private String cnpj;
	
	@Transient
	private String empresaClass;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCodigoProtheus() {
		return codigoProtheus;
	}

	public void setCodigoProtheus(String codigoProtheus) {
		this.codigoProtheus = codigoProtheus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoFilial() {
		return codigoFilial;
	}

	public void setCodigoFilial(String codigoFilial) {
		this.codigoFilial = codigoFilial;
	}

	public String getNomeFilial() {
		return nomeFilial;
	}

	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEmpresaClass() {
		return empresaClass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
