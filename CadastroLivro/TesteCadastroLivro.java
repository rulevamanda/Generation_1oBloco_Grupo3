package CadastroLivro;

import java.util.Scanner;

public class TesteCadastroLivro {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String titulo,autor,genero;
		
		int quant=0,ano,codigo=0;
		
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
		
		
		CadastroLivro novo = new CadastroLivro(titulo+autor+ano+genero+codigo);
			
		novo.printInfo();
		
		quant++;
		System.out.println("Quantidade de livros cadastrados: "+quant);

	}

}
