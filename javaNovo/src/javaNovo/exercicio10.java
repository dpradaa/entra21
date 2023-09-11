package javaNovo;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("escreva a idade do marquinho");
	 int marquinhos = entrada.nextInt();
	 System.out.println("escreva a idade do zezinho");
	 int zezinho = entrada.nextInt();
	 System.out.println("escreva a idade da luluzinha");
	 int luluzinha = entrada.nextInt();
	 
	 if ((marquinhos > zezinho ) && (marquinhos > luluzinha) && (luluzinha > zezinho)){
		 System.out.println("marquinhos é o mais velho, luluzina é a do meio e zezinho é o caçula");}
	 
	 else if (( zezinho > marquinhos ) && (zezinho > luluzinha) && (marquinhos > luluzinha)){
		 System.out.println(" zezinho é o mais velho, marquinhos é a do meio e luluzinha é o caçula");}
	 
	 else if (( zezinho > marquinhos ) && (zezinho > luluzinha) && (marquinhos > luluzinha)){
		 System.out.println(" zezinho é o mais velho, marquinhos é a do meio e luluzinha é o caçula");}
		 
		 else {System.out.println("luluzinha é a mais velha, zezinho é o do meio e o marquinhos é o caçula");}
	 }
	

	}


