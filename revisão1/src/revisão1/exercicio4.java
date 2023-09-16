package revisão1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		/*4. Crie uma array de 5 elementos e descubra: 

			a) Qual o maior elemento 

			b) Qual o menor elemento 

			c) A média dos elementos*/
	
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		double[] vetor = new double[5];
		double soma = 0;
		double media = 0;

		for (int num = 0; num < vetor.length; num++) {

			System.out.println("informe um valor");
			vetor[num] = entrada.nextDouble();
			
			soma = soma + vetor[num];

			if (vetor[num] < menor) {
				menor = vetor[num];
			}

			if (vetor[num] > maior) {
				maior = vetor[num];
			}
		}
		media = soma / vetor.length;

		System.out.println("num maior é: " + maior);
		System.out.println("num menor é:  " + menor);
		System.out.println("a média dos num é:  " + media);
	}

}
