package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		//Offer e add -> adicionam elementos na fila
		// Diferença é o comportamento que ocorre enquanto a fila está cheia!
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); // lança uma exceção
		fila.add("Dan");
		fila.offer("Let");
		fila.add("Ang");
		fila.offer("Filho");
		
		// peek e element -> obter o proximo elemento da fila sem (sem remover) 
		//Diferença é o comportamento que ocorre quando a fila está vazia!
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		// poll e remove -> obter o proximo elemento da fila e remove! 
		//Diferença é o comportamento que ocorre quando a fila está vazia!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		//System.out.println(fila.remove());
		
	}

}
