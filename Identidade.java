public class Identidade extends DocumentoEstadual{

	private String estado;	

	public Identidade(String num, String es){
		super(num);
		this.estado = es;
	}

	public String getEstado(){
		return estado;
	}
	public String getDocInfo(){
		return "Número da Identidade: " + this.getNumero() + "\n"
				 + "Estado do Título de Eleitor: " + this.estado + "\n"
		;
	}

}