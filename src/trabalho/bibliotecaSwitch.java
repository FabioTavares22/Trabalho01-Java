package trabalho;

import java.util.Scanner;

public class bibliotecaSwitch {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Bem Vindo a Biblioteca");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1- Adicionar Livro");
		System.out.println("2- Remover livro");
		System.out.println("3- Pesquisar livro");
		System.out.println("4- Gerar relatório de livros cadastrados em CSV");
		System.out.println("5- sair");
		int menu = scan.nextInt();
		
		String[] cadastroFeito = option1();
		
		switch(menu) {
		case 1:{
			option1();
			break;
		}
		case 2:{
			option2();
			break;
		}
		case 3:{
			option3();
			break;
		}
		case 4:{
			option4();
			break;
		}
		case 5:{
			option5();
			break;
		}
		default:{
			System.out.println("Opção inválida!");
		}
		}
	}
	private static String[] option1() {
		String[] cadastrou = new String[4];
		System.out.println("Vamos iniciar o Cadastro do livro!");
		System.out.println("Informe o nome do livro: ");
		String name = scan.next();
		System.out.println("Informe o número de páginas: ");
		int numPg = scan.nextInt();
		scan.nextLine();
		System.out.println("Informe o nome do autor: ");
		String nomeAutor = scan.next();
		System.out.println("Informe a área de interesse: ");
		String areaInteresse = scan.next();
		return cadastrou;
	}
	private static void option2() {
		System.out.println("Informe o dado do livro para pesquisar: ");
		String dado = scan.nextLine();
		
	}
	private static void option3() {
		// TODO Auto-generated method stub
		
	}
	private static void option4() {
		// TODO Auto-generated method stub
		
	}
	private static void option5() {
		// TODO Auto-generated method stub
		
	}

}
