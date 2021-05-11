package CadastroLivro;

import java.util.Scanner;

public class CadastroLivro {
	
	Scanner leia = new Scanner(System.in);
	
	private String titulo;
	private String autor;
	private String genero;
	private int quant=0;//quantidade de livros cadastrados
	private int ano;//ano de publicação
	private int codigo=0;//simples usar ++ para simplificação
	private int conf;//confirmação do cadastro

	public CadastroLivro(String titulo, String autor, String genero, int ano, int codigo) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ano = ano;
		this.codigo = codigo;
	}
	
	public void printInfo() {
		System.out.println("Título: "+titulo+"\nAutor: "+autor+"\nAno de publicação: "+ano+"\nGênero: "
								+genero+"\nCódigo gerado: "+codigo);
	}
	
	public Scanner getLeia() {
		return leia;
	}
	
	public void setLeia(Scanner ler) {
		this.leia = ler;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getConf() {
		return conf;
	}

	public void setConf(int conf) {
		this.conf = conf;
	}

}
