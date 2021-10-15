package ProgOrientadaAObjetos.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 10);
		compra1.adicionarItem("Notebook", 1987.88,2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 29, 10);
		compra2.adicionarItem("Impressora", 890.0 ,2);
		
		Cliente cliente = new Cliente("Leticia França dos Santos");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("O valor total da compra foi de: R$ " + cliente.obterValorTotal());
	}

}
