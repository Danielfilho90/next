package next;

public class substituiArrays {

	public static void main(String[] args) {
		
		int varArray[] = {12,7,5,10};
		
		for (int i = 0; i < varArray.length; i++) {
		varArray[i] = varArray[i] * 2;
		System.out.println(varArray);
	}
}
}