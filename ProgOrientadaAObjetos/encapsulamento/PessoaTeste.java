package ProgOrientadaAObjetos.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Daniel","Filho",  31);
		
		p1.setIdade(150);
		
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
		
	}

}
