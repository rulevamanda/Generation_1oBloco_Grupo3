import java.util.Scanner;

public class exercicio3_202105051019 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a idade de uma pessoa
		 * e mostre na saída em qual categoria ela se encontra:
		 * 10-14 infantil
		 * 15-17 juvenil
		 * 18-25 adulto
		 */
		
		int idade;
		
		Scanner leia= new Scanner(System.in);
				
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14){
			System.out.println("Categoria Infantil");
		}
		
		if(idade>=15 && idade<=17){
			System.out.println("Categoria Juvenil");
		}
		
		if(idade>=18 && idade<=25){
			System.out.println("Categoria Adulto");
		}
		
		if(idade>=26){
			System.out.println("Participante idose demais.");
		}
		
		if(idade<=9){
			System.out.println("Participante jovem demais.");
		}
	}

}
