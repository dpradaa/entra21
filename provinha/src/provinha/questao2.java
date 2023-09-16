package provinha;

import java.util.Scanner;  /*Equilátero - quando possui três lados com a mesma medida.
Isósceles - quando possui dois lados com a mesma medida.
Escaleno - quando os três lados tem medidas diferentes.*/  

public class questao2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva o primeiro lado do triangulo");
		double valor1 = entrada.nextDouble();
		System.out.println("escreva o primeiro lado do triangulo");
		double valor2 = entrada.nextDouble();
		System.out.println("escreva o primeiro lado do triangulo");
		double valor3 = entrada.nextDouble();
		
	    if (valor1 == valor2 && valor2 == valor3);
			System.out.println("triangulo Equilátero");
	    else if (valor1 == valor2 ) || (valor2 == valor3) || (valor3 == valor1)
			System.out.println("triangulo Isóceles");
	    else System.out.println("triangulo Escaleno");
		
		
		
	}

}
