package next;

public class Questao1Java {
	public static void main(String[] args) {
		
		int[] arrInteiros = {1,2,3,4,5,6,7,8,9,10};
		
		int[] arrInverso = new int[10];
		
		for (int i = 9; i >= 0 ; i--) {
			arrInverso[i] = arrInteiros[i];
			System.out.println(i);
		}
		for (int i : arrInverso) {
			System.out.print(i +"\n");
			
		}
	}

}
