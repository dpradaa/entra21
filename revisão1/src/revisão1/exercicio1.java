package revisão1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		/*1. O índice de massa corporal (IMC) é uma medida internacional usada para calcular se um pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula: 

			IMC = Massa / Altura² 

			 

			Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela: 

			 

			< 18.5 Magreza 

			18.5 – 24.9 Saudável 

			25.0 – 29.9 Sobrepeso 

			30.0 – 34.9 Obesidade Grau I 

			35.0 – 39.9 Obesidade Grau II (severa) 

			> 40.0 Obesidade Grau III (morbida)*/
		
		System.out.println("digite o seu IMC");
		double imc = entrada.nextDouble();
		
		
		if(imc < 18.5) {
			System.out.println("magreza");
		}
		else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("saudavel");
		}
		else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("sobrepeso");
		}
		else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}
		else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa)");
		}
		else if (imc > 40) {
			System.out.println("Obesidade Grau III (morbida)");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
