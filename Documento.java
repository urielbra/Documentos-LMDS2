public abstract class Documento{
	private String numero;

	public Documento(String num){
		this.numero = num;
	}

	public abstract String getDocInfo(); // Método abstrato não possui corpo
	
	public String getNumero(){
		return numero;
	}

}