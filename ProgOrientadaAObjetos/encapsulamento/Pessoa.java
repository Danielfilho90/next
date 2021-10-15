package ProgOrientadaAObjetos.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	private String sobrenome;
	
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
		
		
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	//getter
	public int getIdade() {
		return idade;
	}
	//setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		
		if(novaIdade >= 0 && novaIdade <= 130) {
			this.idade = novaIdade;
		}
	}
	
	public String toString() {
		
		return "Olá eu sou o " + getNome() + " " + getSobrenome() + " e tenho " + getIdade() + " anos.";
	}
}
