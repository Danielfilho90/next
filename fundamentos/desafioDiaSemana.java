package fundamentos;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class desafioDiaSemana {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o nome do dia: ");
	String dia = entrada.next();
	
	if("domingo".equalsIgnoreCase(dia)) {
		System.out.println(1);
	}
	else if("domingo".equalsIgnoreCase(dia)) {
		System.out.println(1);
	}else if("segunda".equalsIgnoreCase(dia)) {
		System.out.println(2);
	}else if("terca".equalsIgnoreCase(dia)
			||"ter?a".equalsIgnoreCase(dia)) {
		System.out.println(3);
	}else if("quarta".equalsIgnoreCase(dia)) {
		System.out.println(4);
	}else if("quinta".equalsIgnoreCase(dia)) {
		System.out.println(5);
	}else if("sexta".equalsIgnoreCase(dia)) {
		System.out.println(6);
	}else if("sabado".equalsIgnoreCase(dia)
			||"s?bado".equalsIgnoreCase(dia)) {
			System.out.println(7);
	}else {
		System.out.println("N?o ? um dia valido");
	}
	entrada.close();
 }
 
}