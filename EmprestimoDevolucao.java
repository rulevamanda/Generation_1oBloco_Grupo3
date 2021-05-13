package prjModuloBloco1;


import java.util.Scanner;
//import java.util.SimpleTimeZone;
//import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmprestimoDevolucao {
	
	private int codigoEmprestimo; //código de um novo empréstimo
	private int codLivro;
	private int codCliente;
	private double multaDevolucao;
	private int diasAtraso;
	private String titulo;
	private String autor;
	private String edicao;
	private String nomeCliente;
	private String dataRetirada;
	private String dataPrevistaEntrega;
	
	/* 
	 * BANCO DOS LIVROS E ROTINA DOS LIVROS
	 * 
	 */
	private int codAnoLivro[][] = { {11, 2015}, {12, 2016}, {13, 1937} }; //matriz 3x2 Código e Ano
	private String infoLivro[][] = { {"Harry Potter e a Pedra Filosofal","J.K. Rowling","2ª edição"},{"Senhor dos Anéis","J.R.R Tolkien","1ªedição"},
			{"Capitães da Areia","Jorge Amado","1ª edição"}};//matriz 3x4
	
	/** FINAL BANCO DOS LIVROS ***/
	
	/*
	 * BANCO DOS EMPRESTIMOS
	 * 
	 */
	private int livroEmprestado[] = {15,16}; //localizar empréstimo pelas chaves codLivro
	private String infoEmprestimo[][] = {{"Harry Potter e a Pedra Filosofal","29/04/2021","06/05/2021","Juci"},
			{"Teste","25/04/2021","01/05/2021","Juci"}}; 
	//matriz 2x4 com dados do emprestimo na ordem título, data retirada, data entrega, cliente
	
	/** FINAL BANCO EMPRESTIMO ***/	

	//private String infoEmprestimo [][] = {{"Titulo","12/05/2021"
	LocalDate dataAtual = LocalDate.now(); //pega a data de hoje	
	LocalDate dataEntrega = LocalDate.now().plusDays(7); //adicionando 7 dias para a data de entrega
	
	
	//LocalDate dataPrevista = LocalDate.of(2021,05,05); //data prevista era dia 03 do 05
	
	Scanner leia = new Scanner(System.in);
	
	//Formatando a exibição das datas
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
    //método construtor da superclasse EmprestimoDevolucao
	public EmprestimoDevolucao (int codCliente) {
		
		super();
		this.codCliente = codCliente;
		this.nomeCliente = "Joãozinho"; //pensar de onde virá o nome
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void fazerEmprestimo() {
		
		int localizador = 0;
		// SQL --> this.cliente deverá receber o nome do cliente referente ao cód cliente olhando para
		//a tabela cliente
		System.out.println("Identificador do livro: ");
		this.codLivro = leia.nextInt();
		
		//lógica de encontrar o livro
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j <2; j ++) {
				if (codAnoLivro[i][j] == codLivro) {
					localizador = i;
				} 
			}
		}
		this.titulo = infoLivro[localizador][0];
		this.autor = infoLivro[localizador][1];
		this.edicao = infoLivro[localizador][3];
		System.out.println("\n");
		System.out.println("Título livro: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		
		System.out.println("\nConfirmar empréstimo - Digite y: sim ou n: não)");
		String confirmaEmprestimo = leia.next();
		
		if ("y".equals(confirmaEmprestimo)) {
			 imprimirEmprestimo();
		} else {
			System.out.println("Código do livro: ");
			this.codLivro = leia.nextInt();
		}

	}
	
	public void imprimirEmprestimo() {
		
		// SQL --> os dados codEmprestimo, cod Livro, cod cliente, data retirada e data entrega deverão
		//ser INSERT no bd
		System.out.println("    -------------------------------------");
		System.out.println("\t -- Dados do Empréstimo -- ");
		System.out.println("\tEmprestimo "+this.codigoEmprestimo);
		System.out.println("\tID: "+this.codLivro + " - Título: "+this.titulo+" |"+this.edicao);
	    String dataAtualFormatada = dataAtual.format(formatter);
		System.out.println("\tData de retirada: " + dataAtualFormatada);
		String dataEntregaFormatada = dataEntrega.format(formatter);
		System.out.println("\tData de devolução: "+ dataEntregaFormatada); //data prevista a ser devolvida
	}
	
	public void devolverLivro() {
		int local = 0; 
		System.out.println("Identificador do livro: ");
		this.codLivro = leia.nextInt();
		
		//lógica de encontrar o emprestimo utilizando o cod Livro
		
		for (int i = 0; i < 2; i ++) {
				if (livroEmprestado[i] == codLivro) {
					local = i;
					break;
				} else {
					local = -1;
				}
		} 
		

		if (local >= 0) {
			this.titulo = infoEmprestimo[local][0];
			this.dataRetirada = infoEmprestimo[local][1];
			this.dataPrevistaEntrega = infoEmprestimo[local][2];
			this.nomeCliente = infoEmprestimo[local][3];
			imprimirDevolucao();
		} else {
			System.out.println("Ops! Código do livro não localizado.");
		}
		
	}
	public void imprimirDevolucao() {
		//colocar num método imprimirDevolução
		System.out.println("--- DADOS DA DEVOLUÇÃO --- ");
		System.out.println("Título: "+ titulo);
		System.out.println("Data de retirada: "+ dataRetirada);
		System.out.println("Data de devolução: "+dataPrevistaEntrega);
		
		
		//String dataDevolucaoFormatada = dataAtual.format(formatter); //OPCIONAL
		//System.out.println("Data de devolução: "+dataDevolucaoFormatada);
		
		//pegando a data prevista de entrega e convertendo de string para date
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate entregaEsperada = LocalDate.parse(dataPrevistaEntrega, formato); 

		//método que faz a diferença das datas e retorna o valor em qtd de dias
		long diasDeAtraso = ChronoUnit.DAYS.between(entregaEsperada, dataAtual);
		System.out.println("Quantidade de dias de atraso " + diasDeAtraso+" dias");
		
		this.multaDevolucao = 2.0 * diasDeAtraso;
		System.out.println("Multa por atraso: " + multaDevolucao);
	}
}
