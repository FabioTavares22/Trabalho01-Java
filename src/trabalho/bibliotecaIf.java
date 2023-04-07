package trabalho;

import java.util.Scanner;

public class bibliotecaIf {
	
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
		
		if(menu == 1) {
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
		} else if(menu == 5) {
			System.out.println("Obrigado!");
		}

	}

}
