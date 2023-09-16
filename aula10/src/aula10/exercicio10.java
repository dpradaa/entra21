package aula10;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada  = new Scanner(System.in);
		
		int [] vetor = new int [5];
		
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;
		vetor[4] = 5;
			
		for(int i = 4; i >= 0; i--) {
			
			System.out.println(vetor[i]);
		}

	}

}
