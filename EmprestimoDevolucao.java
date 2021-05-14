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
	
	private int codigoEmprestimo; //c�digo de um novo empr�stimo
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
	//private int codAnoLivro[][] = { {11, 2015}, {12, 2016}, {13, 1937} }; //matriz 3x2 C�digo e Ano
	
	/* Descer o c�digo para o m�todo 
	List <Integer> codLivroEmprestimo = new ArrayList<Integer>();
	private String infoLivro[][] = { {"Harry Potter e os Piratas do Caribe","J.R.R. Tolkien","2� edi��o"},{"Alice no Pa�s da F�brica de Chocolates","Stephen King","1�edi��o"},
			{"Como Esconder Um Corpo - Vol. 2","Zibia Gasparetto","1� edi��o"}, {"Meu P� de Abacate","Bruno Henrique","1� edi��o"}, {"Entrevista Com o Corcunda de Notre Dame","Mahatma Gandhi","3� edi��o"},{"O Ataque dos Veganos Carn�voros","Hannibal Lecter","5� edi��o"}};//matriz 3x4
	*/
	/** FINAL BANCO DOS LIVROS ***/
	
	/*
	 * BANCO DOS EMPRESTIMOS
	 * 
	 */
	//private int livroEmprestado[] = {15,16}; //localizar empr�stimo pelas chaves codLivro

	/* Descer esse c�digo para o m�todo devolverLivro
	List <Integer> livroEmprestado = new ArrayList<Integer>();
	private String infoEmprestimo[][] = {{"Harry Potter e os Piratas do Caribe","29/04/2021","06/05/2021","Juci"},
			{"Teste","25/04/2021","01/05/2021","Juci"}}; 
	//matriz 2x4 com dados do emprestimo na ordem t�tulo, data retirada, data entrega, cliente
	
	/** FINAL BANCO EMPRESTIMO ***/	

	
	
	
	//private String infoEmprestimo [][] = {{"Titulo","12/05/2021"
	LocalDate dataAtual = LocalDate.now(); //pega a data de hoje	
	LocalDate dataEntrega = LocalDate.now().plusDays(7); //adicionando 7 dias para a data de entrega
	
	
	//LocalDate dataPrevista = LocalDate.of(2021,05,05); //data prevista era dia 03 do 05
	
	Scanner leia = new Scanner(System.in);
	
	//Formatando a exibi��o das datas
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
    //m�todo construtor da superclasse EmprestimoDevolucao
	public EmprestimoDevolucao (int codCliente) {
		
		super();
		this.codCliente = codCliente;
		this.nomeCliente = "Jo�ozinho"; //pensar de onde vir� o nome
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
		// SQL --> this.cliente dever� receber o nome do cliente referente ao c�d cliente olhando para
		//a tabela cliente
		System.out.println("Identificador do livro: ");
		this.codLivro = leia.nextInt();
		
		List <Integer> codLivroEmprestimo = new ArrayList<Integer>();
		String infoLivro[][] = { {"Harry Potter e os Piratas do Caribe","J.R.R. Tolkien","2� edi��o"},{"Alice no Pa�s da F�brica de Chocolates","Stephen King","1�edi��o"},
				{"Como Esconder Um Corpo - Vol. 2","Zibia Gasparetto","1� edi��o"}, {"Meu P� de Abacate","Bruno Henrique","1� edi��o"}, {"Entrevista Com o Corcunda de Notre Dame","Mahatma Gandhi","3� edi��o"},{"O Ataque dos Veganos Carn�voros","Hannibal Lecter","5� edi��o"}};//matriz 3x4
		
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
			System.out.println("T�tulo livro: "+this.titulo);
			System.out.println("Autor: "+this.autor);
			
			System.out.println("\nConfirmar empr�stimo - Digite y: sim ou n: n�o)");
			confirmaEmprestimo = leia.next();
			
			if ("y".equals(confirmaEmprestimo)) {
					
				imprimirEmprestimo();
			} else {
				System.out.println("C�digo do livro: ");
				this.codLivro = leia.nextInt();
			}			
			
			
			
		} while("n".equals(confirmaEmprestimo));
		
			
		//l�gica de encontrar o livro
		/*for (int i = 0; i < codLivroEmprestimo.size(); i++) {
		   if (codLivroEmprestimo.get(i) == codLivro ) {
			   localizador = i;
		   }
		}
		this.titulo = infoLivro[localizador][0];
		this.autor = infoLivro[localizador][1];
		this.edicao = infoLivro[localizador][2];
		System.out.println("\n");
		System.out.println("T�tulo livro: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		
		System.out.println("\nConfirmar empr�stimo - Digite y: sim ou n: n�o)");
		String confirmaEmprestimo = leia.next();
		
		if ("y".equals(confirmaEmprestimo)) {
				
			imprimirEmprestimo();
		} else {
			System.out.println("C�digo do livro: ");
			this.codLivro = leia.nextInt();
		}*/

	}
	
	public void imprimirEmprestimo() {
		
		// SQL --> os dados codEmprestimo, cod Livro, cod cliente, data retirada e data entrega dever�o
		//ser INSERT no bd
		System.out.println("    -------------------------------------");
		System.out.println("\t -- Dados do Empr�stimo -- ");
		System.out.println("\tEmprestimo "+this.codigoEmprestimo);
		System.out.println("\tID: "+this.codLivro + " - T�tulo: "+this.titulo+" |"+this.edicao);
	    String dataAtualFormatada = dataAtual.format(formatter);
		System.out.println("\tData de retirada: " + dataAtualFormatada);
		String dataEntregaFormatada = dataEntrega.format(formatter);
		System.out.println("\tData de devolu��o: "+ dataEntregaFormatada); //data prevista a ser devolvida
	}
	
	public void devolverLivro() {
		int local = 0; 
		System.out.println("Identificador do livro: ");
		this.codLivro = leia.nextInt();
		
		
		
		List <Integer> livroEmprestado = new ArrayList<Integer>();
		String infoEmprestimo[][] = {{"Harry Potter e os Piratas do Caribe","29/04/2021","06/05/2021","Juci"},
				{"Teste","25/04/2021","01/05/2021","Juci"}}; 
		
		//livros que est�o emprestados
		livroEmprestado.add(11);
		livroEmprestado.add(12);
		livroEmprestado.add(13);
		//l�gica de encontrar o livro na lista de emprestados
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
			System.out.println("Ops! C�digo do livro n�o localizado.");
		}
		
	}
	public void imprimirDevolucao() {
		//colocar num m�todo imprimirDevolu��o
		System.out.println("--- DADOS DA DEVOLU��O --- ");
		System.out.println("T�tulo: "+ titulo);
		System.out.println("Data de retirada: "+ dataRetirada);
		System.out.println("Data de devolu��o: "+dataPrevistaEntrega);
		
		
		//String dataDevolucaoFormatada = dataAtual.format(formatter); //OPCIONAL
		//System.out.println("Data de devolu��o: "+dataDevolucaoFormatada);
		
		//pegando a data prevista de entrega e convertendo de string para date
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate entregaEsperada = LocalDate.parse(dataPrevistaEntrega, formato); 

		//rotina que faz a diferen�a das datas e retorna o valor em qtd de dias
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
