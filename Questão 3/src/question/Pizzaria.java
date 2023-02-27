package question;

import java.util.Scanner;

public class Pizzaria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite (1) Para Pizza de Calabresa");
		System.out.println("Digite (2) Para Pizza de Muçarela");
		int numero = input.nextInt();

		switch (numero) {

		case 1:
			System.out.println("Calabresa!");
			System.out.println("Gostaria com ou sem borda?");
			String borda = input.next().toLowerCase();
			
			switch(borda) {
			
			case "com borda":
				System.out.println("Com Borda");
				break;
				
			case "sem borda":
				System.out.println("Sem Borda");
				break;
				
			default:
				System.out.println("Não Entendi");
				break;
				
			}
			break;

		case 2:
			System.out.println("Muçarela!");
			break;

	
		default:
			System.out.println("Nenhum dos Sabores acima");
			break;
}
	}
}
