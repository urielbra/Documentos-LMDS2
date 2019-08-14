public class TituloEleitor extends DocumentoFederal{
	private String zona;
	private String secao; 

	public TituloEleitor(String num,String zon,String sec){
		super(num);
		this.zona = zon; 
		this.secao = sec;
	}

	public String getZona(){
		return zona;
	}
	public String getSecao(){
		return secao;
	}
	public String getDocInfo(){
		return "Número do Título de Eleitor: " + this.getNumero() + "\n"
				 + "Zona do Título de Eleitor: " + this.zona + "\n"
				 + "Seção do Título de Eleitor: " + this.secao + "\n"
		;
	}
	

}