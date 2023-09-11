package aula7;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int total = 0 ;
		System.out.println("digite a altura, se quiser parar digite 0");
		double altura = scan.nextDouble();
		double soma = altura;
		
		while (altura != 0) {	
			System.out.println("Infome as alturas");
			altura = scan.nextDouble();
			soma += altura;
			total++;
		}
	 double medialtura = soma / total;
		System.out.println("A média das alturas é: " +  medialtura);
	}


}  

/*Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
* com o número 0 Calcule a média de altura das mesma*/