package ArraysCollections;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Quantas notas : ");
	
	int qtdNotas = entrada.nextInt();
	
	double[] notas = new double[qtdNotas];
	
	for (int i = 0; i < notas.length; i++) {
		System.out.print("Informe a nota: " + (i + 1) + ": ");
		notas[i] = entrada.nextInt();	
	}
	double total = 0;
	for(double nota: notas) {
		total += nota;
	}
	double media = total / notas.length;
	System.out.println("A m�dia �: " + media + "!");
	entrada.close();
	}

}
