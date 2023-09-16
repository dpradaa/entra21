package matrizes;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char [][] matriz = new char [3][3];
		
		
		for(int linha = 0; linha < 3; linha++ ) {
			for(int coluna = 0; coluna < 3; coluna++ ) {
				System.out.println("insira na linha: [" + linha
						+ "] e coluna: [" + coluna + "]" );
				char aux = entrada.next().charAt(0);
				matriz[linha][coluna] = aux;
				
			}
			
		}
		for(int linha = 0; linha < 3; linha++ ) {
			for(int coluna = 0; coluna < 3; coluna++ ) {
				System.out.print(matriz[linha][coluna] + ",");
			}
			System.out.println();
		
	}
		
	}
}

