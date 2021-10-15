package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ol� Pessoal ".charAt(2));
		
		String s = "Boa tarde!";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde!"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde!"));
		System.out.println(s.equalsIgnoreCase("boa tarde!"));
		
		var nome = "Daniel";
		var sobrenome = "Filho";
		var idade = 31;
		var salario = 2800.00;
		
		System.out.println("Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f.", nome , sobrenome, idade, salario);
	}

}
