package provinha;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o valor desejado para a conversão do valor");
		double numero = entrada.nextDouble();
		System.out.println("digite 1 para a conversão de  dollar para real e 2 para a conversão de real para dollar");
		double conversao = entrada.nextDouble();
		if(conversao == 1) 
		{System.out.println("a conversão do valor de dollar para real é" + numero/4.97);}
		else if  (conversao == 2)
		{System.out.println("a conversão do valor de real para dollar é" + numero*4.97);}
		
		
	}

}
