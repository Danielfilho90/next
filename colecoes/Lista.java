package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Heleno");
		lista.add(u1);
	
		lista.add(new Usuario("Daniel"));
		lista.add(new Usuario("Leticia"));
		lista.add(new Usuario("Angela"));
		lista.add(new Usuario("Daniel Filho"));
		
		System.out.println(lista.get(3).nome); // acessar pelo indice
		
		
		System.out.println(">>>>>>>>>" + lista.remove(1));
		System.out.println(">>>>>>>>>" + lista.remove(new Usuario("Heleno")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Daniel Filho")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u : lista) {
			System.out.println(u);
		}
		
	}

}
