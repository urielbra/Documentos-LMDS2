public class Cpf extends DocumentoFederal{

	public Cpf(String numero) {
		super(numero);
	}

	public String getDocInfo(){
		return "Número do CPF: " + this.getNumero();
	}
}