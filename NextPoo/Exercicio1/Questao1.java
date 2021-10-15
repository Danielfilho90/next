package NextPoo.Exercicio1;

import java.util.Scanner;
public class Questao1 {
	
	private static final double porcentagemDistribuidor=0.28;
    private static final double porcentagemImpostos=0.45;
    
	public static void main(String[] args) {
        double custoCarro = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
        	System.out.println("informe o custo de fábrica do carro: ");
        	custoCarro = sc.nextDouble();
    			
		}
		while (custoCarro == 0);
        
        double custoTotal= custoCarro*(1+porcentagemDistribuidor+porcentagemImpostos);
        System.out.println("o custo total é: "+custoTotal);
        
        sc.close();
    }


}
