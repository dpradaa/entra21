package aula7;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("escreva um numero");
	    double numero = scanner.nextDouble();
		while(numero > 1) {
			System.out.println("escreva um numero");
			numero = scanner.nextInt();
			
			System.out.println("fim");
		}
		
		
		
	}

}


//1. Escreva um algoritmo que leia um número do teclado até que encontre um número menor ou igual a 1.