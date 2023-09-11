package aula7;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		
		System.out.println("informe um número entre 12 a 20");
		double numero = entrada.nextInt();

		while ((numero >= 12) && (numero <= 20))  {
		System.out.println(numero);
		 numero = entrada.nextInt();
		 		
		}
		
		 System.out.println("o numero invalido, digite novamente");
		
		 
	}

}


//3. Faça um programa que peça ao usuário um número entre 12 e e 20. Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número novamente. Se digitar correto mostrar o número digitado. 