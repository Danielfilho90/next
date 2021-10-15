package NextPoo;

public class Funcionario {
	
	private String nome = "Daniel";
	private String funcao = "Desenvolvedor";
	private String id = "7575";
	Funcionario gerente;
	static double aumentoColetivo = 0.03;
	double AumentoMerito;
	double salario = 4000.0;
	
	public static void main(String[] args) {
		
		Funcionario funcionarioGerente = new Funcionario();
		Funcionario funcionarioDaniel = new Funcionario();
		
		funcionarioDaniel.gerente = funcionarioGerente;
		
		funcionarioDaniel.AumentoMerito = 1.134;
		//funcionarioDaniel.aumentoColetivo;
		
		System.out.println(funcionarioDaniel.gerente);
		System.out.println("Nome do Funcionário: " + funcionarioDaniel.nome + "\n"+ 
		"ID: " + funcionarioDaniel.id +  "\n" + "Função: " + funcionarioDaniel.funcao);
		System.out.println("Salário reajustado após convenção: " + funcionarioDaniel.salario * funcionarioDaniel.AumentoMerito);
	}
}