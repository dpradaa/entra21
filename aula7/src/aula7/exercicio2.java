package aula7;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);

		double soma = 0;
	
		System.out.println("escreva um numero");
		
		double numero = entrada.nextDouble();
		{while(numero != 0) {
			soma = soma + numero;
			System.out.println("escreva um numero");
			numero = entrada.nextDouble();}
			
			
			System.out.println("o valor da soma dos números é" + soma);
	}

}

}


//2. Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.