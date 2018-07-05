public enum WttdDados {

	Cliente(Cliente.class, ClienteWttd.class,ClienteWttd.isCompartilhado);
	private Class<?> classePrincipal;
	private Class<?> classeEmpresa;
	boolean compartilhado;

	private WttdDados(Class<?> classePrincipal, Class<?> classeEmpresa,boolean compartilhado) {
		this.classePrincipal = classePrincipal;
		this.classeEmpresa = classeEmpresa;
		this.compartilhado = compartilhado;
	}

	public Class<?> getClassePrincipal() {
		return classePrincipal;
	}

	public Class<?> getClasseEmpresa() {
		return classeEmpresa;
	}

	public boolean isCompartilhado() {
		return compartilhado;
	}
}
