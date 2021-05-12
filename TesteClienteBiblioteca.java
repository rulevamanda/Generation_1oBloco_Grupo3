package Cliente;

import java.util.Scanner;

public class TesteClienteBiblioteca {

	public static void main(String[] args) {
		
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
		
		System.out.println("\nTelefone: ");
		int telefone = leia.nextInt();
		
		System.out.println("\nEndereço: ");
		String endereco = leia.nextLine();
		
		System.out.println("\nE-mail: ");
		String email = leia.nextLine();
		
		System.out.println("Matricula: ");
		int id = leia.nextInt();
		
	}

}
