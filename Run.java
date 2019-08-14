import java.util.Scanner;
import java.util.ArrayList;
public class Run{

	public static void main(String args[]){

		ArrayList<Pessoa> portaria = new ArrayList<Pessoa> ();
		Scanner ler = new Scanner (System.in);
		String num,zona,secao,estado;
		Pessoa teste = new Pessoa();
		boolean choice = true;

		System.out.println("Seja bem vindo, vamos cadastrar seus documentos? \n\n\n");
		while (choice){
		System.out.println("\n\n~Indentidade~");
		System.out.println("Digite o número da Indentidade");
		num = ler.nextLine();
		System.out.println("Digite o estado da Indentidade");
		estado = ler.nextLine();
		Identidade id = new Identidade (num,estado);
		teste.addDoc(id);
		
		System.out.println("\n\n~CPF~");
		System.out.println("Digite o número da CPF");
		num = ler.nextLine();
		Cpf cp = new Cpf (num);
		teste.addDoc(cp);

		System.out.println("\n\n~Título de Eleietor~");
		System.out.println("Digite o número da Título de Eleietor");
		num = ler.nextLine();
		System.out.println("Digite o zona da Título de Eleietor");
		zona = ler.nextLine();
		System.out.println("Digite o seção da Título de Eleietor");
		secao = ler.nextLine();
		TituloEleitor te = new TituloEleitor (num,zona,secao);
		teste.addDoc(te);
		teste.showDocs();
		portaria.add(teste);

		System.out.println("Deseja cadastrar mais alguém?");
		System.out.println("1. Sim");
		System.out.println("0. Não");
		choice = ler.nextInt() == 1 ? true : false ;
		}

	}


}