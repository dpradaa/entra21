package javaNovo;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("escreva a idade do primeiro irmão");
		int idade1 = entrada.nextInt();
		System.out.println("escreva a idade do segundo irmão");
		int idade2 = entrada.nextInt();
		System.out.println("escreva a idade do terceiro irmão");
		int idade3 = entrada.nextInt();
	
		if ((idade1 == idade2) && (idade1 == idade3)) {
			System.out.println("são trigemeos");}
		else if ((idade1 == idade2) && (idade1 != idade3)) {
			System.out.println("irmão 1 e irmão 2 são gemeos ");}
		else if ((idade1 == idade3) && (idade1 != idade2)) {
			System.out.println("irmão 1 e irmão 3 são gemeos ");}
		else if ((idade2 == idade3) && (idade1 != idade2)) {
			System.out.println("irmão 2 e irmão 3 são gemeos ");}
		else {System.out.println("eles são apenas irmãos");
		}
	
		


	}

}
