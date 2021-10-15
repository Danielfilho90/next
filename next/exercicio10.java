package next;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        int resultadoFatorial = 1;
	        
	        System.out.println("Enter a number: ");
	        int num = sc.nextInt();
	        int valorInicial = num;

	        while(num > 0){
	            if (num == 1){
	                break;
	            }
	            resultadoFatorial = resultadoFatorial*num;
	            num--;
	        }

	        System.out.println("O resultado do fatorial de " + valorInicial + " é: " + resultadoFatorial);
	        sc.close();
	    }

	}