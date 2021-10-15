package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno Principe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println("Qual livro está no topo " + livros.peek() + " (Peek)");
		System.out.println("Qual livro está no topo " + livros.element()+ " (element)");
		
		System.out.println("eu removi " + livros.poll());
		System.out.println("eu removi " + livros.poll());
		System.out.println("eu removi " + livros.poll());
		//System.out.println(livros.remove());
	}

}
