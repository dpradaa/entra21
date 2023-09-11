package vetores;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double menor = Double.MAX_VALUE; 
		double maior = Double.MIN_VALUE;
		
		double[] vetor = new double[5];
		//vector.length = tamanho do vetor (quantidade de elemntoos)
		
			double soma = 0;
			
			for (int indice = 0; indice < vetor.length; indice++) {
				System.out.println("Informe um valor");
			
				//double = valor entrada.nextDouble();
				//vetor[indice] = valor
				vetor[indice] = entrada.nextDouble();
				soma = soma + vetor[indice];
				if (vetor[indice]< menor) {
					menor = vetor[indice];
				}
				
				if(vetor[indice] > maior){
					maior = vetor[indice];
					
				}
			}
			
			System.out.println("Valor maior:"+ maior);
			System.out.println("Valor menor:"+ menor);
			System.out.println("A média: "+ (soma / vetor.length));
		}
		
	}


