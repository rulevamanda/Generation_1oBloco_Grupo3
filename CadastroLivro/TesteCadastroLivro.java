package CadastroLivro;

import java.util.Scanner;

public class TesteCadastroLivro {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String titulo,autor,genero;
		
		int quant=0,ano,codigo=0,status;
		
		System.out.println("Digite o t�tulo do livro: ");
		titulo = read.nextLine();
		
		System.out.println("Digite o autor do livro: ");
		autor = read.nextLine();
		
		System.out.println("Digite o genero do livro: ");
		genero = read.nextLine();
		
		System.out.println("Digite o ano de publica��o do livro: ");
		ano = read.nextInt();
		
		codigo++;
		System.out.println("C�digo gerado: "+codigo);
		
		System.out.println("Status do livro para empr�stimo: ");
		status=read.nextInt();

		if(status==1) {
			System.out.println("DISPON�VEL");
		}
		
		if(status==2) {
			System.out.println("INDISPON�VEL");
		}
		
		
		CadastroLivro novo = new CadastroLivro("T�tulo: "+titulo+"\nAutor: "+autor+"\nAno de publica��o: "+ano+"\nG�nero: "
				+genero+"\nC�digo gerado: "+codigo+"\nStatus para empr�stimo: "+status);
				
		quant++;
		System.out.println("Quantidade de livros cadastrados: "+quant);

	}

}
