package fundamentos;

import java.awt.print.Printable;

public class desafioLogicos {
public static void main(String[] args) {
	//trabalho na terça (V OU F)
	//trabalho na quinta (v ou f)
	boolean trabalho1 = false;
	boolean trabalho2 = false;
	
	boolean comprouTv50 = trabalho1 && trabalho2;
	boolean comprouTv32 = trabalho1 ^ trabalho2;
	boolean comprouSorvete = trabalho1 || trabalho2;
	boolean maisSaudavel = !comprouSorvete;
	
	System.out.println("Comprou TV 50\"" + comprouTv50);
	System.out.println("Comprou TV 32\"" + comprouTv32);
	System.out.println("Comprou TV 32\"sorvete? " + comprouSorvete);
	System.out.println("Mais saudavel " + maisSaudavel);
}
}
