package next;

public class Questao4java {
	
	public static void main(String[] args) {
	
		int[] arr10 = {1,2,3,4,5,6,7,8,9,10};
		int[] arrMetade = new int[5];
		
		int maior = arr10[0];
		
		for (int i = 0; i < arr10.length/2; i++) {
			arrMetade[i] = arr10[i];
			if (maior < arr10[i]) {
				maior = arr10[i];		
		}
		}
		System.out.println("Nesta parte o maior elemento é: " + maior + "\n");
		maior = arr10[5];
		for (int i = 5; i < arr10.length; i++) {
			if (maior < arr10[i]) {
				maior = arr10[i];
			}
	}
		System.out.println("Nesta parte o maior elemento é: " + maior);
}
}