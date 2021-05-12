package prjModuloBloco1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmprestimoDevolucao {
	
	private int codigoEmprestimo; //código de um novo empréstimo
	private int codLivro;
	private int codCliente;
	private float multaDevolucao;
	private int diasAtraso;
	private String tituloLivro;
	private String autorLivro;
	private String nomeCliente;

	LocalDate dataAtual = LocalDate.now(); //pega a data de hoje	
	LocalDate dataEntrega = LocalDate.now().plusDays(7); //adicionando 7 dias para a data de entrega
	
	LocalDate dataPrevista = LocalDate.of(2021, 5, 3); //data prevista era dia 03 do 05
	
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
		
		
		// SQL --> this.cliente deverá receber o nome do cliente referente ao cód cliente olhando para
		//a tabela cliente
		System.out.println("Identificador do livro: ");
		this.codLivro = leia.nextInt();
		this.tituloLivro = "código select que irá pegar o título no banco de dados";
		this.autorLivro = "cod select que irá pegar o autor no bd";
		System.out.println("\n");
		System.out.println("Título livro: "+this.tituloLivro);
		System.out.println("Autor: "+this.autorLivro);
		
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
		System.out.println("\tID: "+this.codLivro + " - Título: "+this.tituloLivro);
	    String dataAtualFormatada = dataAtual.format(formatter);
		System.out.println("\tData de retirada: " + dataAtualFormatada);
		String dataEntregaFormatada = dataEntrega.format(formatter);
		System.out.println("\tData de devolução: "+ dataEntregaFormatada); //data prevista a ser devolvida
	}
	
	public void devolverLivro() {
		System.out.println("Código do livro: ");
		this.codLivro = leia.nextInt();
		
		String dataDevolucaoFormatada = dataAtual.format(formatter);
		System.out.println("Data de devolução: "+dataDevolucaoFormatada);
		long diasDeAtraso = ChronoUnit.DAYS.between(dataPrevista, dataAtual);
		System.out.println("Quantidade de dias de atraso " + diasDeAtraso);
	}
}
