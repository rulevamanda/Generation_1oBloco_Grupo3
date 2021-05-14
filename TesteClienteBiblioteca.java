package prjModuloBloco1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteClienteBiblioteca {

	public static void TesteClienteBiblioteca() {
	//public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("CADASTRO DE CLIENTES");
		
		System.out.println("--------------------");
		
		System.out.println("\nNome: ");
		String nome = leia.nextLine();
		
		System.out.println("\nSexo: ");
		String sexo = leia.nextLine();
		
		System.out.println("\nCPF: ");
		String cpf =leia.nextLine();
		
		System.out.println("\nData de nascimento: ");
		String dtnass = leia.nextLine();
		
		//System.out.println("\nTelefone: ");
		//int telefone = leia.nextInt();
		int telefone = 0;
		
		 boolean continueLoop = true;
		
		do {
			try {		
				System.out.println("\nTelefone: ");
				telefone = leia.nextInt();
				continueLoop = false;
			}
			
			catch(InputMismatchException e) {
				System.err.printf("\nExceptption: %s\n",e);
				leia.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro. Por favor, tente novamente.\n");
			}
			
		}while(continueLoop);
	
		leia.nextLine(); //limpando buffler do scanner leia
		System.out.println("\nEndereço: ");
		String endereco = leia.nextLine();
		
		System.out.println("\nE-mail: ");
		String email = leia.nextLine();
		
		System.out.println("\nCódigo Cliente: ");
		int id = leia.nextInt();
		
		ClienteBiblioteca novoCliente = new ClienteBiblioteca(nome, sexo, cpf, dtnass, telefone, endereco, email, id);
		
		System.out.println("-------- Dados do novo cliente cadastrado ------------");

		System.out.println("Nome: "+ novoCliente.getNome() + "\nsexo: " + novoCliente.getSexo()+ "\nCPF: " +novoCliente.getCpf());
		
		 // public String getClienteNome() { System.out.println("Nome: "); nome =
		 // leia.nextLine(); String clientenome = nome; return clientenome; }
		
		leia.nextLine();
		System.out.println("Confirma dados cliente: y/n");
		String resp = leia.nextLine();
		if("y".equals(resp)) {
			System.out.println("Dados Salvos");
		} else if ("n".equals(resp)){
		System.out.println("Quais dados deseja alterar: ");
		} else {
			System.out.println("Ops!! Responda com y ou n.");
		}
		
	}

}
