package prjModuloBloco1;

import java.util.Scanner;

public class TesteDevolucao{

	public static void TesteDevolucao() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codCliente;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t\n::: Devolução de Livros ::: \n");
		System.out.println("Código Cliente: ");
		codCliente = leia.nextInt();
		EmprestimoDevolucao devolucao = new EmprestimoDevolucao(codCliente);
		devolucao.devolverLivro();
	}

}
