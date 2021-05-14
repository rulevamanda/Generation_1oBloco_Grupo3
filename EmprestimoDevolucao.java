package prjModuloBloco1;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.text.NumberFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmprestimoDevolucao {
	
	private int codLivro;
	private int codCliente;
	private double multaDevolucao;
	private String titulo;
	private String autor;
	private String edicao;
	private String nomeCliente;
	private String dataRetirada;
	private String dataPrevistaEntrega;
	Scanner leia = new Scanner(System.in);

	

	LocalDate dataAtual = LocalDate.now(); //pega a data de hoje	
	LocalDate dataEntrega = LocalDate.now().plusDays(7); //adicionando 7 dias para a data de entrega
	
	//Formatando a exibição das datas
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
    //método construtor da superclasse EmprestimoDevolucao
	public EmprestimoDevolucao (int codCliente) {
		
		super();
		this.codCliente = codCliente;
	}
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void fazerEmprestimo() {
		String confirmaEmprestimo;
		int localizador = -1;
		int localCliente = -1;
		boolean cliente = false;
		
		//lista dos clientes cadastrados
		List <Integer> codClienteCadastrado = new ArrayList<Integer>();
		String infoCliente[] = {"Bueno", "Bruno", "Amanda","Miguel","Juci"};
		
		//clitens cadastrados
		codClienteCadastrado.add(11);
		codClienteCadastrado.add(12);
		codClienteCadastrado.add(13);
		codClienteCadastrado.add(14);
		codClienteCadastrado.add(15);
		
		do {
			for (int i = 0; i < codClienteCadastrado.size(); i++) {
				   if (codClienteCadastrado.get(i) == codCliente ) {
					   localCliente = i;
					   cliente = true;
				   } 
				}
			if (localCliente == -1) {
				System.out.println("Ops!! Cliente não localizado.");
				System.out.println("Digite novamente o código do cliente: ");
				codCliente = leia.nextInt();
			} else {
				this.nomeCliente = infoCliente[localCliente];
			}
		} while (!cliente);
		
		System.out.println("Olá "+ nomeCliente);
		
		//lista dos livros cadastrados
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
		
		boolean continueLoop = true;
		do {
			try {		
				System.out.println("Identificador do livro: ");
				this.codLivro = leia.nextInt();
				continueLoop = false;
			}
			
			catch(InputMismatchException e) {
				//System.err.printf("\nExceptption: %s\n",e);
				leia.nextLine();
				System.out.println("\nDigite um valor do tipo inteiro. Por favor, tente novamente.\n");
			}
			
		}while(continueLoop);

		do {
			for (int i = 0; i < codLivroEmprestimo.size(); i++) {
			   if (codLivroEmprestimo.get(i) == codLivro ) {
				   localizador = i;
			   } 
			}
			
			if (localizador == -1 ) {
				System.out.println();
				System.out.println("Ops!! Livro não encontrado.");
				System.out.println("Identificador do livro: ");
				this.codLivro = leia.nextInt();
				confirmaEmprestimo = "n";
			} else {				
				this.titulo = infoLivro[localizador][0];
				this.autor = infoLivro[localizador][1];
				this.edicao = infoLivro[localizador][2];
				System.out.println();
				System.out.println("Título livro: "+this.titulo);
				System.out.println("Autor: "+this.autor);
				System.out.println("\nConfirmar empréstimo - (Digite y: sim ou n: não)");
				confirmaEmprestimo = leia.next();
				if ("y".equals(confirmaEmprestimo)) {
					imprimirEmprestimo();
				} else {
					localizador = -1;
					System.out.println("Identificador do livro: ");
					this.codLivro = leia.nextInt();
					confirmaEmprestimo="n";
				}		
			}
		} while("n".equals(confirmaEmprestimo));
	}
	
	public void imprimirEmprestimo() {

		System.out.println("  -------------------------------------------------");
		System.out.println("\t      --- Empréstimo --- ");
		System.out.println("\tID: "+this.codLivro + " - Título: "+this.titulo+" | "+this.edicao);
	    String dataAtualFormatada = dataAtual.format(formatter);
		System.out.println("\tData de retirada: " + dataAtualFormatada);
		String dataEntregaFormatada = dataEntrega.format(formatter);
		System.out.println("\tData de devolução: "+ dataEntregaFormatada); //data prevista a ser devolvida
		System.out.println("  -------------------------------------------------");
	}
	
	public void devolverLivro() {
		int local = -1;
		boolean achou = false;

		
		
		//tabela empréstimo
		List <Integer> livroEmprestado = new ArrayList<Integer>();
		String infoEmprestimo[][] = {{"Capitães Da Areia","29/04/2021","06/05/2021","Juci"},
				{"Sociedade Do Cansaço","25/04/2021","01/05/2021","Byung-Chul Han"},
				{"As Crônicas De Gelo E Fogo - Livro 1","07/05/2021","14/05/2021","Marcos"}}; 
		
		//livros que estão emprestados
		livroEmprestado.add(110);
		livroEmprestado.add(120);
		livroEmprestado.add(130);
		
		//lógica de encontrar o livro na lista de emprestados
		do {
			boolean continueLoop = true;
			do {
				try {							
					System.out.println("Identificador do livro: ");
					this.codLivro = leia.nextInt();
					continueLoop = false;
				}
				catch(InputMismatchException e) {
					//System.err.printf("\nExceptption: %s\n",e);
					leia.nextLine();
					System.out.println("\nDigite um valor do tipo inteiro. Por favor, tente novamente.\n");
				}	
			}while(continueLoop);
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
				achou = true;
			} else {
				System.out.println("Ops! Registro do livro não localizado.");
				achou = false;
			}
			
		} while (!achou);
		
	}
	
	public void imprimirDevolucao() {
		//colocar num método imprimirDevolução
		System.out.println("  -------------------------------------------------");
		System.out.println("\t      --- Devolução --- ");
		System.out.println("\tTítulo: "+ titulo);
		System.out.println("\tData de retirada: "+ dataRetirada);
		System.out.println("\tData de devolução: "+dataPrevistaEntrega);
		
		//pegando a data prevista de entrega e convertendo de string para date
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate entregaEsperada = LocalDate.parse(dataPrevistaEntrega, formato); 

		//rotina que faz a diferença das datas e retorna o valor em qtd de dias
		long diasDeAtraso = ChronoUnit.DAYS.between(entregaEsperada, dataAtual);
	
		
		if (diasDeAtraso > 0) {
			//rotina que calcula a multa e converte a moeda
			this.multaDevolucao = 2.0 * diasDeAtraso;
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String multaFormatoMoeda = nf.format(this.multaDevolucao);
			System.out.println("\tQuantidade de dias de atraso: " + diasDeAtraso+" dias");
			System.out.println("\tMulta por atraso: " + multaFormatoMoeda);
			System.out.println("\tCobrar de: "+this.nomeCliente);
			System.out.println("  -----------------------------------------------");
		} else {
			System.out.println("\tDevolução realizada sem pendências!!");
			System.out.println("  ------------------------------------------------");
		}
		

	}
}
