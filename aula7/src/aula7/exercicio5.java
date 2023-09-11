package aula7;

import java.util.*;

public class exercicio5 {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("informe uma fruta que você gosta (apenas letras minúsculas!!!)");
	        String fruta = scanner.nextLine();

	        while (fruta.equals("banana") || fruta.equals("uva") || fruta.equals("maca") || fruta.equals("morango") || fruta.equals("laranja") || fruta.equals("tomate")) {
	            switch (fruta) {
	                case "banana":
	                    System.out.println("não gosto de banana");
	                    break;

	                case "uva":
	                    System.out.println("não gosto de uva");
	                    break;

	                case "maca":
	                    System.out.println("não gosto de maçã");
	                    break;

	                case "morango":
	                    System.out.println("não gosto de morango");
	                    break;

	                case "laranja":
	                    System.out.println("não gosto de laranja");
	                    break;

	                case "tomate":
	                    System.out.println("gosto de tomate :)");
	                    break;

	                default:
	                    System.out.println("não conheço essa fruta");
	                    break;
	            }

	            System.out.println("informe outra fruta que você gosta (apenas letras minúsculas!!!)");
	            fruta = scanner.nextLine();
	        }

	        System.out.println("programa encerrado");
	    }
}


	

