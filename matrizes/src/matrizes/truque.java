package matrizes;

import java.util.Random;
import java.util.Scanner;

public class truque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		
		Random generator = new Random();
		
		int [][] matrizR = new int[2][2];
		
		for(int linha = 0; linha < 2; linha++) {
			for(int coluna = 0; coluna < 2; coluna++) {
				matrizR[linha][coluna] = generator.nextInt(10);
			}
		}
		
		int[][] matriz = {
				{20, 50 ,30},
				{100, 60, 80}
		
		        };
		
		}
	}


