package matrizes;

public class exercicio5 {

	public static void main(String[] args) {
		
		
		double[] [] matriz = new double [1] [10];
		
        
        
		matriz[0][0] = 10;
		matriz[0][1] = 29;
		matriz[0][2] = 30;
		matriz[0][3] = 49;
		matriz[0][4] = 50;
		matriz[0][5] = 67;
		matriz[0][6] = 70;
		matriz[0][7] = 83;
		matriz[0][8] = 90;
		matriz[0][9] = 101;
		
		double qnumpar = 0;
		double qnumimpar = 0;
		double somapar = 0;
		double somaimpar = 0;
		
		for(int coluna = 0; coluna <  matriz[0].length; coluna++) {
			
			if(matriz[0][coluna] % 2 == 0) {
				
				qnumpar++;
				somapar = somapar + matriz[0][coluna];
				
				
				}
			
				else {
					qnumimpar++;
					somaimpar = somaimpar + matriz[0][coluna];
					}
				}
		System.out.println("quantidade de pares é:  +" + qnumpar);
		System.out.println("quantidade de impares é:  +" + qnumimpar);
		System.out.println("a soma dos números pares é: " + somapar);
		System.out.println("a soma dos números impares é: " + somaimpar);
			
				
			}
		
			

	}


