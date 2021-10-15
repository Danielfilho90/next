package NextPoo.Polimorfismo;

public class Mamifero extends Animal {
	
	private String corPele;

	public String getCorPele() {
		return corPele;
	}

	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}
	
	public String alimentar() {
		return "";
	}

}
