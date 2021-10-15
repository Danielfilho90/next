package next;

import java.util.Scanner;

public class ExercicioSwitch {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String dia = sc.next().toLowerCase();
	

    switch (dia) {
      case "d":
        System.out.println("Domingo");
        break;

      case "s":
        System.out.println("Segunda");
        break;
    
      case "t":
      System.out.println("Terça");
      break;

      case "q":
        System.out.println("Quarta");
        break;

      default:
        System.out.println("Dia da semana inválido");
        break;
    }
}
}