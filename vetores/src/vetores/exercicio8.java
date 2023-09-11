package vetores;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[10];
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe um valor");
			vetor[i] = entrada.nextInt();
			
		}
		System.out.println("informe um valor para  ver se ele é array");
		int varivaleAuxiliar = entrada.nextInt();
		
		boolean possuiElemento = false;
		for ( int i = 0; i < vetor.length; i++) {
			if (vetor[i] == varivaleAuxiliar) {
				possuiElemento = true;
				System.out.println("indice: " + i);
			}
			if(possuiElemento == false) {
				System.out.println("não tem");
			}
		}
		
	}
	

}
