public enum EmpresaProtheus {
	
	WTTD("01","Wttd") {
		@Override
		public Class<?> classeConverter(String classe) {
			return WttdDados.valueOf(classe).getClasseEmpresa();
		}

		@Override
		public boolean isCompartilhado(String classe) {
			return WttdDados.valueOf(classe).isCompartilhado();
		}

		@Override
		public boolean isExclusivo(String classe) {
			return !WttdDados.valueOf(classe).isCompartilhado();
		}

	}
	private String codigo;
	private String nome;
	
	private EmpresaProtheus(String codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}
 
	public String getNome() {
		return nome;
	}
	
	public abstract Class<?> classeConverter(String classe);
	public abstract boolean isCompartilhado(String classe);
	public abstract boolean isExclusivo(String classe);
}