package next;

import java.util.Scanner;

public class Questao5java {
	
	public static void main(String[] args) {
	
		String[] nomes = {"Daniel", "Angela"};
		String[] telefones = {" 81 - 99904-5453", "81 - 99904-5393"};
		String nome;
		
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		nome = nome.toLowerCase();
		
		for (int i = 0; i < telefones.length; i++) {
			if(nome.equals(nomes[i].toLowerCase())) {
				System.out.println("O nome do contato é: " + nomes[i] + telefones[i]);
			}	
		}
	}
}
