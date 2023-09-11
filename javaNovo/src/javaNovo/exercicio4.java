package javaNovo;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("escreva a idade do nadador");
		int idade = entrada.nextInt();
		
		 if (idade < 5) {
				System.out.println("não pode nada");} 
		
		else if ((idade >= 5) && (idade <= 7)) {
			System.out.println("pré-mirim");

		} else if ((idade >= 8) && (idade <= 10)) {
			
			System.out.println("mirim");
		}

		else if ((idade >= 11) && (idade <= 13)) {
			System.out.println("infantil");
		}

		else if ((idade >= 14) && (idade <= 17)) {
			System.out.println("infanto juvenil");
		}

		else if ((idade >= 18) && (idade <= 20)) {
			System.out.println("juvenil");
		}

		else
			{System.out.println("adulto");}


	}

}
