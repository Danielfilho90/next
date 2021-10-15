package fundamentos;

import java.util.Scanner;

public class desafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 p/sair): ");
			nota = entrada.nextDouble();
			
		if(nota <= 10 && nota >= 0) {
		total += nota;
		qtdDeNotas++;
	} 	else if(nota != -1) {
		System.out.println("Nota Invalida!!!");
	}
		}	
	double media = total / qtdDeNotas;
	System.out.println("Media = " + media);
	entrada.close();
}
}