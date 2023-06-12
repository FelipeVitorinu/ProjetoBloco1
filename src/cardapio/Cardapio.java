package cardapio;

import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio{
    Scanner leia = new Scanner(System.in);
    private String saborPizza, pagamentoEscolhido, formaPagamento;
    private double valorPizza, totalPedido;
    private int numeroPedido;
    

    private ArrayList<String> listaPedidos = new ArrayList<String>();
    public ArrayList<String> listaSabores = new ArrayList<String>();
    public ArrayList<Double> valoresPizza = new ArrayList<Double>();
    public ArrayList<String> saboresEscolhidos = new ArrayList<>();
    public ArrayList<String> formaDePagamento = new ArrayList<>();
    
    // metodo construtor
   //Cadastra as formas de Pagamento
    public void formasDePagamento() {
    	formaDePagamento.clear();
    	formaDePagamento.add(" Dinheiro");
    	formaDePagamento.add(" Pix");
    	formaDePagamento.add(" Cartão de Crédito");
    }
    
    
    //Adiciona dados coletados durante o pedido na listaPedidos
    public void adicionarPedido(String pedido) {
        listaPedidos.add(pedido);
    }

    //gerador de numero para pedidos
    public int gerarNumeroPedido() {
		return ++numeroPedido;
	}

    //consulta numero do pedido
    public int getNumeroPedido() {
		return numeroPedido;
	}
    
    
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	
	public double getValorPizza() {
        return valorPizza;
    }
	

    public void setValorPizza(double valorPizza) {
        this.valorPizza = valorPizza;
    }

    
    public String getFormaPagamento() {
        return formaPagamento;
    }
    
    //Adiciona sabores ao cardapio
    public void adicionarCardapio() {
    	listaSabores.clear();
        listaSabores.add("Calabresa                                    ");
        listaSabores.add("Frango com Catupiry                          ");
        listaSabores.add("Mussarela                                    ");
        listaSabores.add("Portuguesa                                   ");
        
    }
    
    //Adiciona Valores a lista valoresPizza
    public void adicionarValoresPizza() {
    	valoresPizza.clear();
        valoresPizza.add(40.00);
        valoresPizza.add(33.00);
        valoresPizza.add(46.00);
        valoresPizza.add(44.00);
    }
   
    
    //Mostra o cardapio
    public void cardapio() {
        adicionarCardapio();
        adicionarValoresPizza();
        formasDePagamento();
        System.out.println("                        Cardápio                       ");
        System.out.println(" ______________________________________________________");
        System.out.println(" Sabores                                        Valores");
        System.out.println(" ------------------------------------------------------");
        for (int indice = 0; indice < listaSabores.size(); indice++) {
            System.out.println(" " + (indice + 1) + ". " + listaSabores.get(indice) + " " + valoresPizza.get(indice));
    }
        System.out.println(" ______________________________________________________");
    }
    
    
    //Metodo para iniciar o pedido e coletar informações
    public void facaPedido() {
        int opcaoPizza;
        String continuar;
        
        do {
        	cardapio();
            System.out.print("\n  Digite o código do sabor desejado: ");
            opcaoPizza = leia.nextInt();
            ArrayList<String> listaSabores = this.listaSabores;

            if (opcaoPizza > 0 && opcaoPizza <= listaSabores.size()) {
                saborPizza = listaSabores.get(opcaoPizza - 1).trim();
                System.out.println("\n  A Pizza de " + saborPizza + " foi adicionada ao seu pedido!");
                valorPizza = valoresPizza.get(opcaoPizza - 1);
                totalPedido += valorPizza;
                saboresEscolhidos.add(saborPizza);
            } else {
                System.out.println("  Opção inválida, escolha um sabor de nosso cardápio\n");
            }

            System.out.print("  Deseja escolher mais algum sabor? [Sim/Não] ");
            leia.nextLine(); // Limpar o buffer do scanner
            continuar = leia.nextLine();

        } while (continuar.equalsIgnoreCase("Sim"));
        
        System.out.println(" ______________________________________________________");
        System.out.println("\n  Sabores escolhidos:");
        for (String sabor : saboresEscolhidos) {
            System.out.println(" - " + sabor);
        }
        numeroPedido = gerarNumeroPedido();
        System.out.println(" ______________________________________________________");
        System.out.println("  Pedido: " + numeroPedido );
        System.out.println("  O valor total do seu pedido é: R$" + totalPedido);
        
        formaPagamento = formaPagamento();
        
        
        
        String informacoesPedido = "\tNúmero do pedido: " + numeroPedido + "\n\tSabores: " + saboresEscolhidos 
        		+ "\n\tValor Total: " + totalPedido + "\n\tForma de Pagamento: " + formaPagamento;
        
        
        adicionarPedido(informacoesPedido);
        
    }
    
    
    //Seleciona a forma de pagamento do cliente
    public String formaPagamento() {
    	boolean continuar = true;
    	
    	 System.out.println(" ______________________________________________________");
         System.out.println("  Formas de pagamento");
         for (String pay : formaDePagamento) {
             System.out.println( " " + pay);
         } 
         System.out.print("\n  Escolha a forma de pagamento: ");
         pagamentoEscolhido = leia.nextLine();
         formaPagamento = pagamentoEscolhido;
    	
    	while (continuar) {
    		
    	if(pagamentoEscolhido.equalsIgnoreCase("Dinheiro")){
    		System.out.println(" ______________________________________________________");
    		System.out.println("  Pagamento efetuado com sucesso");
    		System.out.println("  Seu pedido está sendo preparado!");
    		System.out.println(" ------------------------------------------------------");
    		continuar = false;
    	}else if(pagamentoEscolhido.equalsIgnoreCase("Pix")){
    		System.out.println(" ______________________________________________________");
    		System.out.println("  Pagamento efetuado com sucesso");
    		System.out.println("  Seu pedido está sendo preparado!");
    		System.out.println(" ------------------------------------------------------");
    		continuar = false;
    	}else if(pagamentoEscolhido.equalsIgnoreCase("Cartão de Crédito")){
    		System.out.println(" ______________________________________________________");
    		System.out.println("  Pagamento efetuado com sucesso");
    		System.out.println("  Seu pedido está sendo preparado!");
    		System.out.println(" ------------------------------------------------------");
    		continuar = false;
    	} else {
    		
            System.out.println("\n          *Forma de pagamento inválida!*             ");
            System.out.println(" ______________________________________________________");
            System.out.println("  Escolha uma das formas de pagamento abaixo:");
            System.out.println("  Formas de pagamento");
            for (String pay : formaDePagamento) {
                System.out.println(" " + pay);
            }
            System.out.print("\n  Escolha a forma de pagamento: ");
            pagamentoEscolhido = leia.nextLine();
            formaPagamento = pagamentoEscolhido;
            
            
        }
    	
    }
    	return formaPagamento;
    	
    }
    
    
    //Lista todos os pedidos na listaPedidos
    public void listarPedidos() {
        System.out.println("\nLista de Pedidos:");

        if (listaPedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
        } else {
            for (String pedido : listaPedidos) {
                System.out.println("- " + pedido);
            }
        }
    }
    
    //Lista um pedido por vez, atraves do numero de pedido
    public void listarPedido(int numeroPedido) {
        System.out.println("\n\tDetalhes do Pedido :");

        boolean pedidoEncontrado = false;

        for (String pedido : listaPedidos) {
            if (pedido.contains("Número do pedido: " + numeroPedido)) {
                System.out.println(pedido);
                pedidoEncontrado = true;
                break;
            }
        }

        if (!pedidoEncontrado) {
            System.out.println("Pedido não encontrado.");
        }
    }
    
    
    //metodo para mostrar status do pedido
    /*public void statusPedido() {
    	System.out.println("\tPedido: " + this.numeroPedido);
		System.out.println("\n\tSabores Escolhidos: " + this.saboresEscolhidos);
		System.out.println("\tValor total do Pedido: " + this.totalPedido);
		System.out.println("\tForma de pagamento: " + getFormaPagamento());
	
	}*/
    
    	/*public void visualizar() {
		
		System.out.println("1 - A Bolonhesa................................R$40,00");
		System.out.println("2 - Bacon......................................R$42,00");
		System.out.println("3 - Calabresa..................................R$33,00");
		System.out.println("4 - Dois Queijos...............................R$44,00");
		System.out.println("5 - Espanhola..................................R$43,00");
		System.out.println("6 - Frango com Catupiry........................R$46,00");
		System.out.println("7 - Lombo......................................R$40,00");
		System.out.println("8 - Mussarela..................................R$33,00");
		System.out.println("9 - Napolitana.................................R$38,00");
		System.out.println("10- Portuguesa.................................R$44,00");
}*/
    
    
}
