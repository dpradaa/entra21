package provinha;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escreva a primeira altura");
		double altura1 = entrada.nextDouble();
		System.out.println("segunda");
		double altura2 = entrada.nextDouble();
		System.out.println("terceira");
		double altura3 = entrada.nextDouble();
		System.out.println("quarta");
		double altura4 = entrada.nextDouble();
		System.out.println("quinta");
		double altura5 = entrada.nextDouble();
		System.out.println("sexta");
		double altura6 = entrada.nextDouble();
		System.out.println("setima");
		double altura7 = entrada.nextDouble();
		System.out.println("oitava");
		double altura8 = entrada.nextDouble();
		System.out.println("nona");
		double altura9 = entrada.nextDouble();
		System.out.println("decima");
		double altura10 = entrada.nextDouble();
		
		System.out.println("a altura media é " + (altura1 + altura2 + altura3 + altura4 + altura5 + altura6 + altura7 + altura8 + altura9 + altura10) / 10);

	}

}
