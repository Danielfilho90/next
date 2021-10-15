package NextPoo.Polimorfismo;

public abstract class Animal {
	private double peso;
	private int idade;
	private String membros;
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMembros() {
		return membros;
	}
	public void setMembros(String membros) {
		this.membros = membros;
	}
	
	public String locomover() {
		return "Andar";
	}
	public abstract String alimentar() {
	}
	public void emitirSom() {
		System.out.println("");
	}
}
