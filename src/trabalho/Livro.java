package trabalho;

public class Livro {
	//Nome do livro, número de páginas, Nome do autor e Área de interesse
	
	private String nomeLivro;
	private int numPagina;
	private String nomeAutor;
	private String areaInteresse;
	
	
	//Construtores
	public Livro() {}


	public Livro(String nomeLivro, int numPagina, String nomeAutor, String areaInteresse) {
		this.nomeLivro = nomeLivro;
		this.numPagina = numPagina;
		this.nomeAutor = nomeAutor;
		this.areaInteresse = areaInteresse;
	}


	public String getNomeLivro() {
		return nomeLivro;
	}


	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}


	public int getNumPagina() {
		return numPagina;
	}


	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}


	public String getNomeAutor() {
		return nomeAutor;
	}


	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}


	public String getAreaInteresse() {
		return areaInteresse;
	}


	public void setAreaInteresse(String areaInteresse) {
		this.areaInteresse = areaInteresse;
	}
	
	public String imprimirNomeLivro() {
		return "Nome do Livro: " + nomeLivro;
	}
	public String imprimirNomeAutor() {
		return "Nome do Autor: " + nomeAutor + "\nNome do Livro: " + nomeLivro;
	}
	public String imprimirAreaInteresse() {
		return "Área de Interesse: " + areaInteresse + "\nNome do Livro: " + nomeLivro;
	}
}
