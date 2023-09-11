package vetores;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = {0, 10, 2, 83, 4, 97, 54, 20, 8, 9};
		
		System.out.println("informe um indice");
		int indice = entrada.nextInt();
		System.out.println(vetor[indice]);
	}

}
