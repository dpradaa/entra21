package provinha;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("digite 1 para informar as suas notas, 2 para retornar os seus dados e 3 para solicitar 5 valores");
		double resposta = entrada.nextDouble();
		
		switch (resposta = 1) {
		case 1:
			System.out.println("informe a sua primeira nota");
			double nota1 = entrada.nextDouble();
			System.out.println("informe a sua segunda nota");
			double nota2 = entrada.nextDouble();
			System.out.println("informe a sua terceira nota");
			double nota3 = entrada.nextDouble();
			
			System.out.println("a sua nota final é " + (nota1 + nota2 + nota3)/3);
			
			break;

		default:
			break;
		}
		
		
		
		

	}

}
