	package cardapio;
	import java.util.Scanner;
	import java.util.ArrayList;
	
	public class lalala {
		    ArrayList<CardapioMenu> cardapio = new ArrayList<CardapioMenu>(); 
		    
		    public lalala() {
		    
			CardapioMenu p1 = new CardapioMenu(1, "Mussarela", 30.0f, "Queijo Mussarela e Molho de Tomate");
			CardapioMenu p2 = new CardapioMenu(2, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
			CardapioMenu p3 = new CardapioMenu(3, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
			CardapioMenu p4 = new CardapioMenu(4, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
			CardapioMenu p5 = new CardapioMenu(5, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
			CardapioMenu p6 = new CardapioMenu(6, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
			CardapioMenu p7 = new CardapioMenu(7, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
			CardapioMenu p8 = new CardapioMenu(8, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
			CardapioMenu p9 = new CardapioMenu(9, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
		    CardapioMenu p10 = new CardapioMenu(10, "Bauru", 32.0f, "Queijo Mussarela, Presunto e Molho de Tomate");
		
		    cardapio.add(p1);
		    cardapio.add(p2);
		    cardapio.add(p3);
		    cardapio.add(p4);
		    cardapio.add(p5);
		    cardapio.add(p6);
		    cardapio.add(p7);
		    cardapio.add(p8);
		    cardapio.add(p9);
		    cardapio.add(p10);
		    }
		public void listarTodos(){
			for (var cardapiofinal : cardapio) {
				cardapiofinal.visualizar();
			}
		}
		/*boolean cont = true;
		
	   while(cont) {
		    p1.visualizar();
			p2.visualizar();
			p3.visualizar();
			p4.visualizar();
			p5.visualizar();
			p6.visualizar();
			p7.visualizar();
			p8.visualizar();
			p9.visualizar();
			p10.visualizar();
			System.out.println("");
			System.out.println("Qual o sabor desejado?");
			int opcao = leia.nextInt();
		   switch(opcao) {
		case 1:
			System.out.println("Pizza Escolhida: ");
			p1.visualizar();
			break;
		case 2:
			System.out.println("Pizza Escolhida: ");
			p2.visualizar();
			break;
			
			default:
				break;
		} 
		System.out.println("\n\nDeseja pedir mais alguma?\n(1)Sim\n(2)Não");
		int continuar = leia.nextInt();	
		if(continuar == 2) {
			cont = false;
	
		}
	   }*/
};