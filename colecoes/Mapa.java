package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Daniel");
		usuarios.put(2, "Leticia");
		usuarios.put(3, "Angela");
		usuarios.put(4, "Emanuelle");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Leticia"));
		
		System.out.println(usuarios.get(2));
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registros : usuarios.entrySet()) {
			System.out.println(registros.getKey() + " ===> ");
			System.out.println(registros.getValue());
		}
	}

}
