package javaNovo;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		
		 
		 System.out.println("informe a sua idade");
		 int idade = entrada.nextInt();
		 
		 
		 if(idade >= 18 && idade <= 67) {
			 System.out.println("pode doar");
			 
		 }
	}

}
