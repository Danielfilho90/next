package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Daniel"));
		usuarios.add(new Usuario("Leticia"));
		usuarios.add(new Usuario("Angela"));
		
		boolean resultado = usuarios.contains(new Usuario("Leticia"));
		System.out.println("Este usuario está no banco de dados? " + resultado);
		
	}

}
