package next;

public class questao5 {
	public static void main(String[] args) {
		
		String[] arrNomes = {"Hermione", "Sasori"};
        String[] arrTelefones = {"(81) 99999-9999", "(81) 88888-8888"};
        String nome;

        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        nome = nome.toLowerCase();

        for (int i = 0; i < arrNomes.length; i++) {
            if (nome.equals(arrNomes[i])) {
                System.out.print("Nome localizado!\n" + arrNomes[i] + "\n" + arrTelefones[i]);
            }
        }
        sc.close();
}
}
}