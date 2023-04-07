package trabalho;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DadosBiblioteca {
	//ArrayList
	private static ArrayList<Livro> listaDeLivros = new ArrayList<>();
	
	//GET
	public static ArrayList<Livro> getListaDeLivros() {
		return listaDeLivros;
	}
	
	//adicionar livro na lista
	static public void incluir(Livro l) {
		listaDeLivros.add(l);
	}
	//Inicio CSV
	public static ArrayList<Livro> obterConteudo(String path) throws IOException {
	ArrayList<Livro> conteudoDoArquivo;
	
	// abre o arquivo e cria caso não exista.
	File arquivo = new File(path);
	if(arquivo.createNewFile()) {
		// Se criar um arquivo novo já retorna com um vetor vazio.
		return new ArrayList<>(0);
	}
	
	// obtém tamanho do arquivo e cria o vetor de linhas
	long tamanhoDoArquivo = Files.lines(Paths.get(path)).count();
	
	conteudoDoArquivo = new ArrayList<>((int)tamanhoDoArquivo);
	int count = 0;
	Scanner scan = new Scanner(arquivo);
	while(scan.hasNextLine()) {
		conteudoDoArquivo.add(null);
		count++;
	}
	
	scan.close();
	
	return conteudoDoArquivo;
}

	public static ArrayList<Livro> adicionarLinhaNoArquivo(String path, String linha) throws IOException {
		ArrayList<Livro> novoConteudo;
	
	// abre o arquivo e/ou cria se não existir
	File arquivo = new File(path);
	arquivo.createNewFile();
	
	// abre o arquivo de modo a poder adicionar conteúdo
	FileWriter writer = new FileWriter(arquivo, true);
	
	// escreva a linha desejada e adiciona um salto de linha no arquivo
	writer.write(linha.concat("\n"));
	writer.close();
	
	novoConteudo = obterConteudo(path);
	
	return novoConteudo;
}

	public static void main(String[] args) throws IOException {
	ArrayList<Livro> conteudo = obterConteudo("C:\\Users\\fabio\\eclipse\\Trabalho\\file.csv");
	
	for(int i =0; i<conteudo.indexOf(conteudo); i++) {
		System.out.println(conteudo);
	}
	System.out.println("Add nova linha");
	ArrayList<Livro> novoConteudo = adicionarLinhaNoArquivo("C:\\Users\\fabio\\eclipse\\Trabalho\\file.csv", "Fabio, 20"); 
	
	for(int i =0; i<novoConteudo.indexOf(novoConteudo); i++) {
		System.out.println(novoConteudo);
	}		
}

//Fim CSV
	
	//fazer as consultas
	static public String consultaTitulo(String nomeLivro) {
		for(Livro l : listaDeLivros) {
			if(l.getNomeLivro().equalsIgnoreCase(nomeLivro)) {
				return nomeLivro;
			}
		}
		return "Livro não encontrado!";
	}
	static public ArrayList<Livro> consultaInteresse(String areaInteresse) {
		ArrayList<Livro> todosOsLivros = new ArrayList<>(); 
		for(Livro l :listaDeLivros) {
			if(l.getAreaInteresse().equalsIgnoreCase(areaInteresse)) {
				todosOsLivros.add(l);
			}
		}
		return todosOsLivros;
	}
	static public ArrayList<Livro> consultaAutor(String nomeAutor) {
		ArrayList<Livro> autor = new ArrayList<>();
		for(Livro l : listaDeLivros) {
			if(l.getNomeAutor().equalsIgnoreCase(nomeAutor)) {
				autor.add(l);
			}
		}
		return autor;
	}
	
	//excluir livro
	static public boolean excluir(String titulo) {
		for(Livro l : listaDeLivros) {
			if(l.getNomeLivro().equalsIgnoreCase(titulo)) {
				listaDeLivros.remove(l);
				return true;
			}
		}
		return false;
	}
	
	public static String listar() {
		String saida = "";
		
		for(Livro l : listaDeLivros) {
			saida += l.imprimirNomeLivro();
		}
		return saida;
	}	
}
