import java.util.Scanner;

public class CadastroNovosLivros {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner(System.in);
		
		String titulo,//nome do livro
				autor,//autor principal do livro, ou autores em ordem alfabética
				genero,//opções fixas para escolha(laço case?)
				local,//localização dentro da bilbioteca
				demanda,//de acordo com a quantidade de empréstimos
				status;//disponível/indisponível
				
		
		int quant=0,//quantidade de livros cadastrados
			ano,//ano de publicação
			codigo,//automatização de código?
			avaliacao=0,//input pelo cliente no momento de devolução
			conf;//confirmação do cadastro
		
		System.out.print("CADASTRO DE NOVOS LIVROS");
		
		System.out.print("\nTítulo:");
		titulo = leia.next();
		
		System.out.print("\nAutor:");
		autor = leia.next();
		
		System.out.print("\nAno de publicação:");
		ano = leia.nextInt();
		
		System.out.print("\nGênero:");
		genero = leia.next();
				
		System.out.print("\nCódigo gerado:");
		//automatização?
		
		System.out.print("\nLocalização gerada:");
		//automatização?
				
		System.out.print("\nDemanda:");
		//automatização
		
		System.out.print("\nAvaliação:"
				+ "\n"+avaliacao);
		
		
		
		System.out.print("\nCONFIRMA?"
				+ "\ndigite 1 para confirmar"
				+ "\ndigite 2 para cancelar");
		conf = leia.nextInt();
		
		while(conf!=1||conf!=2) {
			System.err.print("\nOPÇÃO INVÁLIDA");
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
		System.out.print("\nNúmero de livros cadastrados:"
				+ quant);
		
		

	}

}
