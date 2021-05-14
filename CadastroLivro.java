package prjModuloBloco1;


public class CadastroLivro {
	
	
	private String titulo;
	private String autor;
	private String genero;
	private String edicao;
	private int ano;//ano de publicação
	private int codigo;
	private int conf;//confirmação do cadastro

	public CadastroLivro(String titulo, String autor, String genero, int ano, int codigo, String edicao) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.ano = ano;
		this.codigo = codigo;
		this.edicao = edicao;
	}
	
	public void printInfo() {
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("\t --- NOVO LIVRO CADASTRADO --- ");
		System.out.println("Título: "+titulo+" | ID "+codigo+"\nAutor: "+autor+"\nAno de publicação: "+ano+"\nEdição: "+edicao+"\nGênero: "
								+genero);
		
	}
	

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
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