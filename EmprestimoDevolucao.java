package prjModuloBloco1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.SimpleTimeZone;
//import java.util.Date;
import java.text.NumberFormat;
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
	//private int codAnoLivro[][] = { {11, 2015}, {12, 2016}, {13, 1937} }; //matriz 3x2 Código e Ano
	
	/* Descer o código para o método 
	List <Integer> codLivroEmprestimo = new ArrayList<Integer>();
	private String infoLivro[][] = { {"Harry Potter e os Piratas do Caribe","J.R.R. Tolkien","2ª edição"},{"Alice no País da Fábrica de Chocolates","Stephen King","1ªedição"},
			{"Como Esconder Um Corpo - Vol. 2","Zibia Gasparetto","1ª edição"}, {"Meu Pé de Abacate","Bruno Henrique","1ª edição"}, {"Entrevista Com o Corcunda de Notre Dame","Mahatma Gandhi","3ª edição"},{"O Ataque dos Veganos Carnívoros","Hannibal Lecter","5ª edição"}};//matriz 3x4
	*/
	/** FINAL BANCO DOS LIVROS ***/
	
	/*
	 * BANCO DOS EMPRESTIMOS
	 * 
	 */
	//private int livroEmprestado[] = {15,16}; //localizar empréstimo pelas chaves codLivro

	/* Descer esse código para o método devolverLivro
	List <Integer> livroEmprestado = new ArrayList<Integer>();
	private String infoEmprestimo[][] = {{"Harry Potter e os Piratas do Caribe","29/04/2021","06/05/2021","Juci"},
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
		String confirmaEmprestimo = " ";
		int localizador = 0;
		// SQL --> this.cliente deverá receber o nome do cliente referente ao cód cliente olhando para
		//a tabela cliente
		System.out.println("Identificador do livro: ");
		this.codLivro = leia.nextInt();
		
		List <Integer> codLivroEmprestimo = new ArrayList<Integer>();
		String infoLivro[][] = { {"Harry Potter e os Piratas do Caribe","J.R.R. Tolkien","2ª edição"},{"Alice no País da Fábrica de Chocolates","Stephen King","1ªedição"},
				{"Como Esconder Um Corpo - Vol. 2","Zibia Gasparetto","1ª edição"}, {"Meu Pé de Abacate","Bruno Henrique","1ª edição"}, {"Entrevista Com o Corcunda de Notre Dame","Mahatma Gandhi","3ª edição"},{"O Ataque dos Veganos Carnívoros","Hannibal Lecter","5ª edição"}};//matriz 3x4
		
		//livros cadastrados 
		codLivroEmprestimo.add(112);
		codLivroEmprestimo.add(505);
		codLivroEmprestimo.add(741);
		codLivroEmprestimo.add(362);
		codLivroEmprestimo.add(884);
		codLivroEmprestimo.add(511);
		
		
		do {
			for (int i = 0; i < codLivroEmprestimo.size(); i++) {
			   if (codLivroEmprestimo.get(i) == codLivro ) {
				   localizador = i;
			   }
			}
			this.titulo = infoLivro[localizador][0];
			this.autor = infoLivro[localizador][1];
			this.edicao = infoLivro[localizador][2];
			System.out.println("\n");
			System.out.println("Título livro: "+this.titulo);
			System.out.println("Autor: "+this.autor);
			
			System.out.println("\nConfirmar empréstimo - Digite y: sim ou n: não)");
			confirmaEmprestimo = leia.next();
			
			if ("y".equals(confirmaEmprestimo)) {
					
				imprimirEmprestimo();
			} else {
				System.out.println("Código do livro: ");
				this.codLivro = leia.nextInt();
			}			
			
			
			
		} while("n".equals(confirmaEmprestimo));
		
			
		//lógica de encontrar o livro
		/*for (int i = 0; i < codLivroEmprestimo.size(); i++) {
		   if (codLivroEmprestimo.get(i) == codLivro ) {
			   localizador = i;
		   }
		}
		this.titulo = infoLivro[localizador][0];
		this.autor = infoLivro[localizador][1];
		this.edicao = infoLivro[localizador][2];
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
		}*/

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
		
		
		
		List <Integer> livroEmprestado = new ArrayList<Integer>();
		String infoEmprestimo[][] = {{"Harry Potter e os Piratas do Caribe","29/04/2021","06/05/2021","Juci"},
				{"Teste","25/04/2021","01/05/2021","Juci"}}; 
		
		//livros que estão emprestados
		livroEmprestado.add(11);
		livroEmprestado.add(12);
		livroEmprestado.add(13);
		//lógica de encontrar o livro na lista de emprestados
		for (int i = 0; i < livroEmprestado.size(); i++) {
		   if (livroEmprestado.get(i) == codLivro ) {
			   local = i;
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

		//rotina que faz a diferença das datas e retorna o valor em qtd de dias
		long diasDeAtraso = ChronoUnit.DAYS.between(entregaEsperada, dataAtual);
		System.out.println("Quantidade de dias de atraso " + diasDeAtraso+" dias");
		
		
		//rotina que calcula a multa e converte a moeda
		this.multaDevolucao = 2.0 * diasDeAtraso;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String multaFormatoMoeda = nf.format(this.multaDevolucao);
		
		
		System.out.println("Multa por atraso: " + multaFormatoMoeda);
	}
}
