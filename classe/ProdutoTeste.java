package classe;

import java.util.Scanner;

public class ProdutoTeste {
	
	public static void main(String[] args) {
	
	Produto p1  = new Produto("Notebook", 4356.89);
	
	var p2 = new Produto("Caneta Preta");
	//p2.nome = "Caneta Preta";
	p2.preco = 12.56;
	Produto.desconto = 0.20;
	
	System.out.println(p1.nome + " " + p1.precoCoMdesconto());
	System.out.println(p2.nome + " " + p2.precoCoMdesconto());
	
	double precofinal1 = p1.precoCoMdesconto();
	double precofinal2 = p2.precoCoMdesconto();
	double mediaCarrinho = (precofinal1 + precofinal2) /2;
	
	//double precofinal1 = p1.preco * (1 - p1.desconto);
	//double precofinal2 = p2.preco * (1 - p2.desconto);
	//double mediaCarrinho = (precofinal1 + precofinal2) / 2;
	
	System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
}

}
