package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!!!\n");
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio:");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o segundo sal�rio:");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Informe o terceiro sal�rio:");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println("soma �: " + soma);
		System.out.println("A m�dia dos salarios �: " + media);
		
		
		
		entrada.close();
		
		
		
		
	}

}
