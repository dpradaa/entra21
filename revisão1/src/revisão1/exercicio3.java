package revisão1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		/*3. Descreva um algoritmo que leia vá lendo números inteiros até o usuário entrar com o número 0 

		a) Qual é o menor valor? 

		b) Qual é o maior valor? 

		c) Qual é a média dos valores?*/
		
		 
	

		int media = 0;
		int soma = 0;
		int contador = 0;
		int quantnumeros = 0;
		
		
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		
		
		System.out.println("informe um número");
		int numero = entrada.nextInt();
		
		
		while(numero != 0) {
			
			if(numero < menor) {
				menor = numero;
			}
			if(numero > maior) {
				maior = numero;
			}
			soma = soma + numero;
			quantnumeros++;
			
			System.out.println("informe um número");
			
			numero = entrada.nextInt();
			
			
		}
		
		media = soma / quantnumeros;
		
		System.out.println("operação invalida");
		System.out.println("maior num é: " + maior);
		System.out.println("menor num é: " + menor);
		System.out.println("a média dos num é: " + media);

	}

}
