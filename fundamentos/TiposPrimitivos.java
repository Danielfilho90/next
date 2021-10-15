package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informação do funcionário
		
		// Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos Booleanos
		boolean estaDeFerias = false; // true;
				
		// Tipo caractere
		char status = 'A'; // Ativo
		
		// Dias de Empresa
		System.out.println("Dias de empresa " + anosDeEmpresa * 365);
		
		// Numeros de viagens
		System.out.println("numero de viagens " + numeroDeVoos / 2);
		
		//Pontos por real
		
		System.out.println("Pontos por real " + pontosAcumulados / vendasAcumuladas);
		
		System.out.println("valor " + id + " ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status " + status);
		
		
		
		
	
	}


}
