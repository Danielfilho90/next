package ProgOrientadaAObjetos.Heranca.desafio;

public class VelocidadeMaxima {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		System.out.println();
		
		Ferrari c2 = new Ferrari(400);
		
		c2.ligarTurbo();
		c2.ligarAr();
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
	}
}
