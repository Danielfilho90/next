package NextPoo.Exercicio1;
import java.util.Scanner;
public class Questao2 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroCarrosVendidos = sc.nextInt();
        double valorTotalVendas = sc.nextDouble();
        double salarioFixo = sc.nextDouble();
        double valorRecebidoCarroVendido = sc.nextDouble();

        double salarioFinal = salarioFixo + numeroCarrosVendidos*valorRecebidoCarroVendido + 0.05*valorTotalVendas;
        
        System.out.printf("O salário é: R$ %.2f", salarioFinal);
        sc.close();
    }


}
