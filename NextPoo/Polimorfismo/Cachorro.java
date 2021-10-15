package NextPoo.Polimorfismo;

public class Cachorro extends Mamifero {
	
	public void emitirSom() {
		System.out.println("Au Au!");
	}
	public void reagir() {
		System.out.println("Abana o rabo, lamber, pular");
	}
	public void reagir(String frase) {
		System.out.println(frase);
	}

}
