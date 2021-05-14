package prjModuloBloco1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class TesteCadastroLivro {

	public static void cadastroLivro(int cod) {
		
		Scanner read = new Scanner(System.in);
		String titulo,autor,genero,edicao;
		int ano =0 ,codigo;
		
		System.out.println("...........::: CADASTRAR LIVRO :::...........");
		System.out.print("Digite o título do livro: ");
		titulo = read.nextLine();
		
		System.out.print("Digite o autor do livro: ");
		autor = read.nextLine();
		
		System.out.print("Digite o genero do livro: ");
		genero = read.nextLine();
		
	
		
		boolean continueLoop = true;
		
		do {
			try {		
				System.out.print("Digite o ano de publicação do livro: ");
				ano = read.nextInt();
				continueLoop = false;
			}
			
			catch(InputMismatchException e) {
				//System.err.printf("\nExceptption: %s\n",e);
				read.nextLine();
				System.out.println("\nDigite um valor do tipo inteiro. Por favor, tente novamente.\n");
			}
			
		}while(continueLoop);

	
		read.nextLine();
		System.out.print("Digite a edição de publicação do livro: ");
		edicao = read.nextLine();
		
		codigo = cod;

		CadastroLivro novo = new CadastroLivro(titulo,autor,genero,ano,codigo,edicao);
		novo.printInfo();
		
		
		
	}

}