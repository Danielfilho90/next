package next;

public class Questao3java {
	public static void main(String[] args) {
		
		int[] cinco = {10, 20,50,30,90};
		
		int maior = cinco[0];
		int menor = cinco[0];
		
		for (int i = 0; i < cinco.length; i++) {
			
			if (maior < cinco[i]) {
				maior = cinco[i];
			}
			if (menor > cinco[i]) {
				menor = cinco[i];
		}
	}
		System.out.println("Maior = " + maior +"\n" + "Menor = " + menor);
}
}