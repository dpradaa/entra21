package vetores;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("escolha um indice");
		int indice = entrada.nextInt();
		
		vetor[indice] = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
