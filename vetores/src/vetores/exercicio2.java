package vetores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		double media;
		
		 
			 System.out.println("me informe 3 notas");
			 double notas[] = new double[3];
			 
			 notas[0] = entrada.nextDouble();
			 notas[1] = entrada.nextDouble();
			 notas[2] = entrada.nextDouble();
			 
			 media =  (notas[0] +  notas[1] +  notas[2]) / 3;
			 
			 System.out.println("sua media é " + media);
		 }
	}


