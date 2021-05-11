package CadastroLivro;

import java.util.Scanner;

public class TesteCadastroLivro {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String titulo,autor,genero;
		
		int quant=0,ano,codigo=0,status;
		
		System.out.println("Digite o título do livro: ");
		titulo = read.nextLine();
		
		System.out.println("Digite o autor do livro: ");
		autor = read.nextLine();
		
		System.out.println("Digite o genero do livro: ");
		genero = read.nextLine();
		
		System.out.println("Digite o ano de publicação do livro: ");
		ano = read.nextInt();
		
		codigo++;
		System.out.println("Código gerado: "+codigo);
		
		System.out.println("Status do livro para empréstimo: ");
		status=read.nextInt();

		if(status==1) {
			System.out.println("DISPONÍVEL");
		}
		
		if(status==2) {
			System.out.println("INDISPONÍVEL");
		}
		
		
		CadastroLivro novo = new CadastroLivro("Título: "+titulo+"\nAutor: "+autor+"\nAno de publicação: "+ano+"\nGênero: "
				+genero+"\nCódigo gerado: "+codigo+"\nStatus para empréstimo: "+status);
				
		quant++;
		System.out.println("Quantidade de livros cadastrados: "+quant);

	}

}
