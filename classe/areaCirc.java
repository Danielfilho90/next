package classe;

public class areaCirc {
	double raio;
	static double pi;
	
	areaCirc(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
		
	}
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
