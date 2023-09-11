package vetores;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int tamanhoDoVetor = 5;
		String[] valores = new String [tamanhoDoVetor];
		
		System.out.println("Tamanho do meu vetor:" + valores.length);
		for(int indice = 0; indice < valores.length; indice++) {
			System.out.println("Informe o valor");
			valores[indice] = entrada.next();
		}
			
			for(int indice = (valores.length - 1); indice >= 0; indice--) {	
				System.out.println(valores[indice]);
			}
			
		}

	}


