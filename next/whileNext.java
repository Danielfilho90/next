package next;

import java.util.Scanner;

public class whileNext {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String frase = "";
		
		while (!frase.toUpperCase().equals("SAIR")) {
		System.out.println("Somos Cesar!!!");
		
		frase = sc.nextLine();
			// enquanto usuario nao inserir a palavra "sair" continue operando.
		
		}
		
	}
}
