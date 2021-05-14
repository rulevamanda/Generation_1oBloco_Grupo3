package prjModuloBloco1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		
		int opMenu = 0;
		int codCliente=0, codNovoLivro = 1051;
		Scanner leia = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		

			do {
				System.out.println("\n");
				System.out.println("...:::::::::::: BIBLIOTECA GENERATION BRASIL ::::::::::::...  \n");
				boolean continueLoop = true;
					do {
						try {		
							System.out.println("\tBem vindo! O que deseja fazer? \n\n\t[1] - Cadastrar Livro \n\t[2] - Cadastrar Cliente \n\t[3] - Empr�stimo de Livro \n\t[4] - Devolu��o de Livro \n\t[5] - Sair");
							opMenu = leia.nextInt();
							continueLoop = false;
						}
						catch(InputMismatchException e) {
						//System.err.printf("\nExceptption: %s\n",e);
						leia.nextLine();
						System.out.println("\nDigite um valor do tipo inteiro. Por favor, tente novamente.\n");
						}
					}while(continueLoop);
					
				switch (opMenu){
				case 1:
					TesteCadastroLivro.cadastroLivro(codNovoLivro);
					codNovoLivro++;
					break;
				case 2:
					TesteClienteBiblioteca.clienteBiblioteca();
					
					break;
				case 3:
					//neste op��o estamos instanciando um objeto da classe emprestimo
					System.out.println("\t\n::: Empr�stimo de Livros ::: \n");
					
					boolean continueLoop2 = true;
					do {
						try {		
							System.out.println("C�digo do cliente: ");
							codCliente = leia.nextInt();
							new TesteEmprestimo(codCliente);
							continueLoop2 = false;
						}
						catch(InputMismatchException e) {
						//System.err.printf("\nExceptption: %s\n",e);
						leia.nextLine();
						System.out.println("\nDigite um valor do tipo inteiro. Por favor, tente novamente.\n");
						}
					}while(continueLoop2);
					break;
				case 4:
					TesteDevolucao.devolucao();
					
					break;
				case 5:
					System.out.println("Sistema encerrado pelo usu�rio. At� mais!");
					break;
				default:
					System.err.println("ATEN��O!!! Valor digitado fora das op��es!!! ");
					opMenu = 0;
				}
			} while(opMenu >=0 && opMenu < 5);
		

	}

}
