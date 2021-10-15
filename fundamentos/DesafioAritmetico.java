package fundamentos;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
	
		//int a = 3 * 4 - 10;
		//int b = (int) Math.pow(a, 3);
		
		int a = 6;
		int b = 2 + 3;
		double c = Math.pow(b, 2);
		double d = 2 * 3;
		double soma = a * b * c / d;
		
		double e = 1 - 5;
		double f = 2 - 7;
		double g = 2;
		double soma2 = e * f / g;
		double soma3 = soma2 * Math.pow(soma2, 3);
		
		double j =(int) Math.pow(10, 3);
		
		double somaTotal = soma - soma2 / j;
		
		System.out.println(somaTotal);
		
	
		
		
	 
	}

}
