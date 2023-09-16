package aula10;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		
		int tamanho = 3;
		int[] vetorUm = new int [tamanho];
		int[] vetorDois = new int [tamanho];
		int[] vetorTres = new int [tamanho];

		vetorUm[0] = 1;
		vetorUm[1] = 2;
		vetorUm[2] = 3;
		
		vetorDois[0] = 1;
		vetorDois[1] = 5;
		vetorDois[2] = 6;
		
		for(int i = 0; i < tamanho; i++) {
			vetorTres[i] = vetorUm[i] + vetorDois[i];
		}
		for(int i = 0; i < tamanho; i++) {
			System.out.println(vetorTres[i]);
		}
	}

}
