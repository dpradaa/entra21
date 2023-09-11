package javaNovo;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("informe o valor 1");
		 double valorUm = entrada.nextDouble();
		 System.out.println("informe o valor 2");
		 double valorDois = entrada.nextDouble();
		 System.out.println("informe o valor 3");
		 double valorTres = entrada.nextDouble();
		 
		 String qualProdutoComprar = "";
		 
		 if(valorUm < valorDois && valorUm < valorTres){ 
			 qualProdutoComprar = "produto 1";
		 } else if(valorDois < valorTres) {
			 qualProdutoComprar = "produto 2";
		 }else {
			 qualProdutoComprar = "produto 3";
		 }
		System.out.println("O produto que deve compar é " + qualProdutoComprar);

	}

}
