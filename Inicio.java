package prjModuloBloco1;

import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		
		int opMenu;
		int codCliente;
		Scanner leia = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
			
			System.out.println("\t::.. BIBLIOTECA GENERATION BRASIL ..:: \n");
			System.out.println("\tBem vindo! O que deseja fazer? \n\n\t1-Cadastrar Livro \n\t2-Cadastrar Cliente \n\t3-Empréstimo de Livro \n\t4-Devolução de Livro \n\t5-Sair");
			opMenu = leia.nextInt();
			
			while(opMenu <= 0 || opMenu > 5) {
				System.out.println("ATENÇÃO!!! Valor digitado fora das opções. ");
				System.out.println("Digite o que deseja fazer: \n\t1-Cadastrar Livro \n\t2-Cadastrar Cliente \n\t3-Empréstimo de Livro \n\t4-Devolução de Livro \n\t5-Sair");
				opMenu = leia.nextInt();
			}
			switch (opMenu){
				case 1:
					TesteCadastroLivro.TesteCadastroLivro();
					//TesteCadastroLivro.main(args);
					break;
				case 2:
					TesteClienteBiblioteca.TesteClienteBiblioteca();
					//TesteClienteBiblioteca.main(args);
					break;
				case 3:
					//neste opção estamos instanciando um objeto da classe emprestimo
					System.out.println("\t\n::: Empréstimo de Livros ::: \n");
					System.out.println("Registro do cliente: ");
					codCliente = leia.nextInt();
					new TesteEmprestimo(codCliente);
					break;
				case 4:
					TesteDevolucao.TesteDevolucao();
					//TesteDevolucao.main(args);
					break;
				case 5:
					System.out.println("Sistema encerrado pelo usuário. Até mais!");
					break;
				default:
					System.out.println("Valor digitado fora das opções: ");
					System.out.println("Digite o que deseja fazer: ");
					opMenu = leia.nextInt();
			}
	}

}
