package trabalho;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		int menu;
		//referencia para o arraylist
		Livro objeto;
		int numPagina;
		String nomeLivro = null, nomeAutor, areaInteresse;
		
		do {
			mostraMenu();
			menu = scanInt.nextInt();
			switch(menu) {
			//Cadastro do livro
			case 1:
				System.out.println("Digite o titulo do livro: ");
				nomeLivro = scanString.nextLine();
				System.out.println("Digite o número de página(s):");
				numPagina = scanInt.nextInt();
				System.out.println("Informe o nome do autor: ");
				nomeAutor = scanString.nextLine();
				System.out.println("Informe a área de interesse: ");
				areaInteresse = scanString.nextLine();
				
				//criando a lista de livros
				objeto = new Livro(nomeLivro, numPagina, nomeAutor, areaInteresse);
				
				//guardando no arraylist
				DadosBiblioteca.incluir(objeto);
				break;
			case 2:
				System.out.println("Informe o título que deseja pesquisar: ");
				nomeLivro = scanString.nextLine();
				System.out.println("Resultado(s): " + DadosBiblioteca.consultaTitulo(nomeLivro));
				break;
			case 3:
				System.out.println("Informe a área de interesse que deseja pesquisar: ");
				areaInteresse = scanString.nextLine();
				ArrayList<Livro> resultado = DadosBiblioteca.consultaInteresse(areaInteresse);
				if(resultado.isEmpty()) {
					System.out.println("Área de interesse não encontrada!");
				}else {
					System.out.println("Resultado(s): " + resultado);
				}
				break;
			case 4:
				System.out.println("Informe o nome do autor que deseja pesquisar: ");
				nomeAutor = scanString.nextLine();
				ArrayList<Livro> autor = DadosBiblioteca.consultaAutor(nomeAutor);
				if(autor.isEmpty()) {
					System.out.println("Autor não encontrado!");
				}else {
					System.out.println("Resultado(s): " + nomeLivro);
				}
				break;
			case 5:
				System.out.println("Aqui estão todos os livros da biblioteca: ");
				System.out.println(DadosBiblioteca.listar());
				break;
			case 6:
				System.out.println("Informe o título do livro que deseja excluir: ");
				nomeLivro = scanString.nextLine();
				
				if(! (DadosBiblioteca.getListaDeLivros().isEmpty())) {
					if(DadosBiblioteca.excluir(nomeLivro)) {
						System.out.println("Livro removido com sucesso!");
					}else {
						System.out.println("Livro não encontrado!");
					}
				}else {
					System.out.println("Nenhum livro cadastrado!");
				}
				break;
			case 7:
				System.out.println("Obrigado por utilizar nosso sistema!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
			
		}while(menu != 7);

	}
	
	public static void mostraMenu() {
		System.out.println("Menu de Opções");
		System.out.println("1- Cadastrar Livro");
		System.out.println("2- Pesquisar por título");
		System.out.println("3- Pesquisar por área de interesse");
		System.out.println("4- Pesquisar por autor");
		System.out.println("5- Listar todos os livros");
		System.out.println("6- Remover livro cadastrado");
		System.out.println("7- Sair");
		System.out.println("Escolha uma opção: ");
	}

}
