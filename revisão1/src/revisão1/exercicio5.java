package revisão1;

import java.util.Random;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*5. Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do seu índice 

		Ex: 

		[0] = 0 

		[1] = 1 

		[2] = 4 

		[3] = 9.*/
		
		int num[] = new int[7];
		 
		 for(int i = 0; i < num.length; i++) {
			 num[i] = i * i;
			 
			 System.out.println(num[i]);
		 }
		 
		 
	}

}
