package matrizes;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double soma = 0;
		double media = 0;
		
		int[][] matriz = new int[5][1];
		
		matriz[0][0] = 10;
		matriz[1][0] = 11;
		matriz[2][0] = 12;
		matriz[3][0] = 13;
		matriz[4][0] = 14;
		
		
		
		
		for(int linha = 0; linha <  matriz.length; linha++) {
			
			soma = soma + matriz[0][0];
			
		}
		
		System.out.println("a soma é: " +soma);
		
		
		for(int linha = 0; linha <  matriz.length; linha++) {
			
			media = soma / 5;
		}
		
		System.out.println("a media é: " +media);
		
		
		for(int linha = 0; linha <  matriz.length; linha++) {
			
			if(media >= matriz[0][0]) {
				
				System.out.println();
			}
			}
		}
	}
	


