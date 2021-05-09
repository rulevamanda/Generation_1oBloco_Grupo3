import java.util.Scanner;

public class CadastroNovosLivros {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		
		String titulo,//nome do livro
				autor,//autor principal do livro, ou autores em ordem alfab�tica
				genero,//op��es fixas para escolha(la�o case?)
				local,//localiza��o dentro da bilbioteca
				demanda,//de acordo com a quantidade de empr�stimos
				status;//dispon�vel/indispon�vel
				
		
		int quant=0,//quantidade de livros cadastrados
			ano,//ano de publica��o
			codigo,//automatiza��o de c�digo?
			avaliacao=0,//input pelo cliente no momento de devolu��o
			conf;//confirma��o do cadastro
		
		System.out.print("CADASTRO DE NOVOS LIVROS");
		
		System.out.print("\nT�tulo:");
		titulo = leia.next();
		
		System.out.print("\nAutor:");
		autor = leia.next();
		
		System.out.print("\nAno de publica��o:");
		ano = leia.nextInt();
		
		System.out.print("\nG�nero:");
		genero = leia.next();
				
		System.out.print("\nC�digo gerado:");
		//automatiza��o?
		
		System.out.print("\nLocaliza��o gerada:");
		//automatiza��o?
				
		System.out.print("\nDemanda:");
		//automatiza��o
		
		System.out.print("\nAvalia��o:"
				+ "\n"+avaliacao);
		
		
		
		System.out.print("\nCONFIRMA?"
				+ "\ndigite 1 para confirmar"
				+ "\ndigite 2 para cancelar");
		conf = leia.nextInt();
		
		while(conf!=1||conf!=2) {
			System.err.print("\nOP��O INV�LIDA");
			System.out.print("\nCONFIRMA?"
					+ "\ndigite 1 para confirmar"
					+ "\ndigite 2 para cancelar");
			conf = leia.nextInt();
		}
		
		if(conf==1) {
			System.out.print("\nCADASTRADO");
		}
		
		if(conf==2) {
			System.err.print("\nCANCELADO");
		}
		
		quant++;
		System.out.print("\nN�mero de livros cadastrados:"
				+ quant);
		
		

	}

}
