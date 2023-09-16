package matrizes;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int[] [] matriz = new int [1] [4];
		
         double soma = 0;
         
		matriz[0][0] = 10;
		matriz[0][1] = 20;
		matriz[0][2] = 30;
		matriz[0][3] = 40;
		
		
		for(int coluna = 0; coluna < matriz[0].length; coluna++) {
			
			 soma = matriz[0][coluna] + soma;
			
					
	
		}
	
		System.out.println(soma);
		


	}

}
