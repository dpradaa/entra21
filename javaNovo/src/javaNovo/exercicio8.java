package javaNovo;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro número");
		 int num1 = entrada.nextInt();
		 System.out.println("digite o segundo número");
		 int num2 = entrada.nextInt();
		 System.out.println("digita 1 para soma, 2 para sbtração, 3 para multiplicação ou 4 para divisão");
		 int operacao = entrada.nextInt();
		 
		/* if (operacao == 1) {System.out.println(num1 + num2);} 
		 else if (operacao == 2) {System.out.println(num1 - num2);} 
		 else if (operacao == 3) {System.out.println(num1 * num2);} 
		 else if (operacao == 4) {System.out.println(num1 / num2);} 
		 else System.out.println("repita");*/
		 
		 switch (operacao) {
		case 1:
		{System.out.println(num1 + num2);}
			break;
		case 2:
		{System.out.println(num1 - num2);}
		    break;
		case 3:
		{System.out.println(num1 * num2);} 
			break;
		case 4:
		{System.out.println(num1 / num2);} 
		    break;
		    

		default:
			break;
		}
	}
}

