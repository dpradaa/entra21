package aula10;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		
		float[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, };
		
		float soma = 0;
		
		for(int indice = 0; indice < vetor.length; indice++) {
			soma = soma + vetor[indice];
			
		}
		
		float media = soma / vetor.length;
		
		String valorMaiorQueAMedia = "";
		
		for(int indice = 0; indice < vetor.length; indice++) {
			
			if(vetor[indice] > media) {
				valorMaiorQueAMedia += vetor[indice] + ",";
				
			}
		}
		
		System.out.println("A media: " + media);
		System.out.println("valores maior que a média: " + valorMaiorQueAMedia) ;

	}

}
