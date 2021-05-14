package prjModuloBloco1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteDevolucao{

	public static void devolucao() {
		// TODO Auto-generated method stub
		int codCliente = 0;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t\n::: Devolução de Livros ::: \n");
		boolean continueLoop = true;
		do {
			try {		
				System.out.println("Código do cliente: ");
				codCliente = leia.nextInt();
				continueLoop = false;
			}
			
			catch(InputMismatchException e) {
				//System.err.printf("\nExceptption: %s\n",e);
				leia.nextLine();
				System.out.println("\nDigite um valor do tipo inteiro. Por favor, tente novamente.\n");
			}
			
		}while(continueLoop);
		
		EmprestimoDevolucao devolucao = new EmprestimoDevolucao(codCliente);
		devolucao.devolverLivro();
	}

}
