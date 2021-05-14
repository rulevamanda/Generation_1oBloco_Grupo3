package prjModuloBloco1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteClienteBiblioteca {

	public static void clienteBiblioteca() {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("...........::: CADASTRAR CLIENTE :::...........");
		System.out.print("Nome: ");
		String nome = leia.nextLine();
		
		System.out.print("Sexo: ");
		String sexo = leia.nextLine();
		
		System.out.print("CPF: ");
		String cpf =leia.nextLine();
		
		System.out.print("Data de nascimento: ");
		String dtnass = leia.nextLine();
		
		int telefone = 0;
		
		boolean continueLoop = true;
		
		do {
			try {		
				System.out.println("\nTelefone: ");
				telefone = leia.nextInt();
				continueLoop = false;
			}
			
			catch(InputMismatchException e) {
				//System.err.printf("\nExceptption: %s\n",e);
				leia.nextLine();
				System.out.println("\nDigite um valor do tipo inteiro. Por favor, tente novamente.\n");
			}
			
		}while(continueLoop);
	
		leia.nextLine(); //limpando buffler do scanner leia
		System.out.println("Endereço: ");
		String endereco = leia.nextLine();
		
		System.out.println("E-mail: ");
		String email = leia.nextLine();
		
		
		ClienteBiblioteca novoCliente = new ClienteBiblioteca(nome, sexo, cpf, dtnass, telefone, endereco, email);
		
		System.out.println("-------------------------------------------------");
		System.out.println("\t --- NOVO CLIENTE CADASTRO --- ");
		System.out.println("Nome: "+novoCliente.getNome()+"\nSexo: "+novoCliente.getSexo()+ "\nCPF: " +novoCliente.getCpf() 
			+ "\nData de nascimento: "+novoCliente.getDtnasc()+"\nTelefone: "+novoCliente.getTelefone()+"\nEndereço: "+novoCliente.getEndereco()
			+"\nE-mail: "+novoCliente.getEmail()+"\nCódigo gerado para cliente"+novoCliente.getId());
	
	}

}
