import java.util.ArrayList;
public class Pessoa{

	private ArrayList <Documento> documentos; 

	public Pessoa(){
		documentos = new ArrayList<Documento> ();
	}

	public void addDoc(Documento x) {
		documentos.add(x);
	}
	public void showDocs(){
		for (int i = 0 ; i < documentos.size(); i++) {
			System.out.printf("\nDocumento %d: \n%s\n\n" ,i ,documentos.get(i).getDocInfo());
		}
	}




}