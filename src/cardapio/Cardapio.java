package cardapio;
import java.util.Scanner;

public class Cardapio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		CardapioMenu novoCardapio = new CardapioMenu(0, null, 0, null);
		novoCardapio.visualizar();
		
		int continuar = 0, opcao2 = 0, opcao3 = 0;
		boolean cont = true;
		float sabor1 = 0.0f;
		float sabor2 = 0.0f;
		float sabor3 = 0.0f;
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println("Qual a " + contador + "º Opção Desejada?");
			int opcao = ler.nextInt();
		switch(opcao) {
			case 1:
				sabor1 = 40.0f;
				break;
			case 2:
				sabor1 = 42.0f;
				break;
			case 3:
				sabor1 = 33.0f;
				break;
			case 4:
				sabor1 = 44.0f;
				break;
			case 5:
				sabor1 = 43.0f;
				break;
			case 6:
				sabor1 = 46.0f;
			case 7:
				sabor1 = 40.0f;
				break;
			case 8:
				sabor1 = 33.0f;
				break;
			case 9:
				sabor1 = 38.0f;
			case 10:
				sabor1 = 44.0f;
				break;
			}		
		System.out.println("Deseja Pedir mais Alguma?\n(1)Sim\n(2)Não");
		continuar = ler.nextInt();
		
		if(continuar == 1) {
			novoCardapio.visualizar();
			contador++;
			
			System.out.println("Qual a " + contador + "º Opção Desejadapção: ");
			opcao2 = ler.nextInt();
			
			switch(opcao2) {
			case 1:
				sabor1 = 40.0f;
				break;
			case 2:
				sabor1 = 42.0f;
				break;
			case 3:
				sabor1 = 33.0f;
				break;
			case 4:
				sabor1 = 44.0f;
				break;
			case 5:
				sabor1 = 43.0f;
				break;
			case 6:
				sabor1 = 46.0f;
			case 7:
				sabor1 = 40.0f;
				break;
			case 8:
				sabor1 = 33.0f;
				break;
			case 9:
				sabor1 = 38.0f;
			case 10:
				sabor1 = 44.0f;
				break;
		} 
			System.out.println("Deseja Pedir mais Alguma?\n(1)Sim\n(2)Não");
			continuar = ler.nextInt();
			
			if(continuar == 1) {
				novoCardapio.visualizar();
				contador++;
				System.out.println("Qual a " + contador + "º Opção Desejadaa?");
				opcao2 = ler.nextInt();
				
				switch(opcao2) {
				case 1:
					sabor1 = 40.0f;
					break;
				case 2:
					sabor1 = 42.0f;
					break;
				case 3:
					sabor1 = 33.0f;
					break;
				case 4:
					sabor1 = 44.0f;
					break;
				case 5:
					sabor1 = 43.0f;
					break;
				case 6:
					sabor1 = 46.0f;
				case 7:
					sabor1 = 40.0f;
					break;
				case 8:
					sabor1 = 33.0f;
					break;
				case 9:
					sabor1 = 38.0f;
				case 10:
					sabor1 = 44.0f;
					break;
				}	
				
				System.out.println("Deseja Pedir mais Alguma?\n(1)Sim\n(2)Não");
				continuar = ler.nextInt();
				
				if(continuar == 1) {
					novoCardapio.visualizar();
					contador++;
					
					System.out.println("Qual a " + contador + "º Opção Desejadaa?");
					opcao3 = ler.nextInt();
					
					switch(opcao3) {
					case 1:
						sabor3 = 40.0f;
						break;
					case 2:
						sabor3 = 42.0f;
						break;
					case 3:
						sabor3 = 33.0f;
						break;
					case 4:
						sabor3 = 44.0f;
						break;
					case 5:
						sabor3 = 43.0f;
						break;
					case 6:
						sabor3 = 46.0f;
					case 7:
						sabor3 = 40.0f;
						break;
					case 8:
						sabor3 = 33.0f;
						break;
					case 9:
						sabor3 = 38.0f;
					case 10:
						sabor3 = 44.0f;
						break;
					}	
}
}
	}
		System.out.println("Valor total: " + (sabor1 + sabor2 + sabor3));
}
}
}