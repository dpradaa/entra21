package matrizes;

import java.util.Scanner;

public class exercicio9 {

		public static void main(String[] args) {
			
			/*6. Crie um programa onde o usuário define quantas linhas e colunas deve ter uma matriz,
			e posteriormente imprima o total de elementos(posições) que está matriz tem*/
			

			Scanner entrada = new Scanner(System.in);

			System.out.println("informe o numero de linhas e depois o numero de colunas");
			
			int qntlinhas = entrada.nextInt();
			int qntcolunas = entrada.nextInt();
			
			int [][] matriz = new int [qntlinhas][qntcolunas];
			
			for(int linhas = 0; linhas < qntlinhas; linhas++) {
				
				for(int colunas = 0; colunas < qntcolunas; colunas++) {
					
					System.out.println(matriz[linhas][colunas]);
				}
				
				System.out.println();
			}
			

		}
	}
