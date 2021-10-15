package NextPoo;

public class Livro {
	//artista da capa, titulo, autor(a), editora, quantidade de páginas, ano de lançamento
	String artistaDaCapa;
	String titulo;
	String autor = "Monteiro Lobato";
	String editora;
	int qtdDePaginas;
	static int anoDeLancamento;
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		livro1.editora = "ROCCO!";
		livro2.editora = "LEYA";
		livro1.autor = "J K ROWLING";
		
		System.out.println(livro1.editora);
		System.out.println(livro2.editora);
	}
	
	

}
