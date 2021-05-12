package prjModuloBloco1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmprestimoDevolucao {
	
	private int codigoEmprestimo; //c�digo de um novo empr�stimo
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
		
		
		// SQL --> this.cliente dever� receber o nome do cliente referente ao c�d cliente olhando para
		//a tabela cliente
		System.out.println("Identificador do livro: ");
		this.codLivro = leia.nextInt();
		this.tituloLivro = "c�digo select que ir� pegar o t�tulo no banco de dados";
		this.autorLivro = "cod select que ir� pegar o autor no bd";
		System.out.println("\n");
		System.out.println("T�tulo livro: "+this.tituloLivro);
		System.out.println("Autor: "+this.autorLivro);
		
		System.out.println("\nConfirmar empr�stimo - Digite y: sim ou n: n�o)");
		String confirmaEmprestimo = leia.next();
		
		if ("y".equals(confirmaEmprestimo)) {
			 imprimirEmprestimo();
		} else {
			System.out.println("C�digo do livro: ");
			this.codLivro = leia.nextInt();
		}

	}
	
	public void imprimirEmprestimo() {
		
		// SQL --> os dados codEmprestimo, cod Livro, cod cliente, data retirada e data entrega dever�o
		//ser INSERT no bd
		System.out.println("    -------------------------------------");
		System.out.println("\t -- Dados do Empr�stimo -- ");
		System.out.println("\tEmprestimo "+this.codigoEmprestimo);
		System.out.println("\tID: "+this.codLivro + " - T�tulo: "+this.tituloLivro);
	    String dataAtualFormatada = dataAtual.format(formatter);
		System.out.println("\tData de retirada: " + dataAtualFormatada);
		String dataEntregaFormatada = dataEntrega.format(formatter);
		System.out.println("\tData de devolu��o: "+ dataEntregaFormatada); //data prevista a ser devolvida
	}
	
	public void devolverLivro() {
		System.out.println("C�digo do livro: ");
		this.codLivro = leia.nextInt();
		
		String dataDevolucaoFormatada = dataAtual.format(formatter);
		System.out.println("Data de devolu��o: "+dataDevolucaoFormatada);
		long diasDeAtraso = ChronoUnit.DAYS.between(dataPrevista, dataAtual);
		System.out.println("Quantidade de dias de atraso " + diasDeAtraso);
	}
}
