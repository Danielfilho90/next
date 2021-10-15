package NextPoo;

import java.util.Scanner;

public class Conta {
	
	private final int id;
	private String nome;
	private double saldo;
	private String endereco;
	
	public Conta(int id) {
		this.id = id;
	}
	
	double getSaldo() {
		return saldo;
	}

	String getNome() {
		return nome = "Daniel";
		
	}
	void setSaldo(double s) {
		this.saldo = s;
		
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setEndereco(String rua, String numero, String bairro) {
		this.endereco = rua + ", n " + numero + ", " + bairro;
		return;
	}
	public static void main(String[] args) {
		
		Conta contaA = new Conta(10);
		System.out.println(contaA.saldo);
		
		contaA.setSaldo(500);
		System.out.println(contaA.saldo);
		
		contaA.getNome();
		System.out.println(contaA.nome);
		
		contaA.setEndereco("Rua Rui Barbosa ", "317 ", "Cajueiro Seco");
		System.out.println(contaA.endereco);

	}
}
