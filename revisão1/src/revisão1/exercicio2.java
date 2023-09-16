package revisão1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		/*Escreva um algoritmo printe o número 0, 2, 4, 6, 8 ...  até o número 5 mil*/
		
		for (int num = 0; num <= 5000; num += 2) {
			System.out.println(num);
		}
	}

}
