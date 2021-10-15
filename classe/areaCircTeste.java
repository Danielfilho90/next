package classe;

public class areaCircTeste {
	public static void main(String[] args) {
		areaCirc a1 = new areaCirc(10);
					
		areaCirc a2 = new areaCirc(5);
		
		areaCirc.pi = 3.1415;
		
			System.out.println(a1.area());
			System.out.println(a2.area());
		}
}