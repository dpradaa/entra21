package vetores;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		int tamanhoVetor = 10;
		int[] vetor = new int [tamanhoVetor];
		
		for(int indice = 0; indice < 10; indice++) {
			vetor[indice] = indice * indice;
		}
	
        
		for(int indice = 0; indice < 10; indice++) {
			System.out.println(vetor[indice]);}

	}

}
