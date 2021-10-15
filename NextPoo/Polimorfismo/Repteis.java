package NextPoo.Polimorfismo;

public class Repteis extends Animal {
	
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public String alimentar() {
		return "Onivoro";
	}
}
