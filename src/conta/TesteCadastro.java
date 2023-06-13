package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import cardapio.Pedidos;
import conta.controller.ControllerConta;
import contaUtil.Cores;

public class TesteCadastro {

	public static void main(String[] args) {
		ControllerConta contas = new ControllerConta();
		Pedidos pedidos = new Pedidos();

		int opcoesMenu, opcoesConta, opcoesPedido, numeroConta, numeroPedido;

		Scanner leia = new Scanner(System.in);

		while (true) {
			System.out.println(Cores.TEXT_WHITE_BOLD);
			System.out.println(" ______________________________________________________");
			System.out.println("                                                       ");
			System.out.println("\t\t    Sapore Nobile");
			System.out.println("\t\t Pizzaria Artesanal");
			System.out.println(" ______________________________________________________");
			System.out.println("\n\t\t\t MENU\n");
			System.out.println("\t\t[1] - Cadastro");
			System.out.println("\t\t[2] - Pedidos");
			System.out.println("\t\t[3] - Sair");
			System.out.println(" ______________________________________________________");
			System.out.print("\n\t    Escolha a opção desejada: ");

			try {
				opcoesMenu = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(Cores.TEXT_RED_BOLD + "\n\tDigite valores inteiro!");
				leia.nextLine();
				opcoesMenu = 0;
			}

			if (opcoesMenu == 3) {
				System.out.println("\n  Agradecemos aos nossos clientes pela preferência");
				System.out.println("\t\tEquipe Sapore Nobile");

				leia.close();
				System.exit(0);
			}

			switch (opcoesMenu) {

			case 1 -> {
				System.out.println(" ______________________________________________________");
				System.out.println("\n\t  Bem vinde ao Menu de Cadastro\n");
				System.out.println("\t [1] - Criar Conta ");
				System.out.println("\t [2] - Atualizar Dados da Conta");
				System.out.println("\t [3] - Consultar Conta");
				System.out.println("\t [4] - Deletar Conta");
				System.out.println("\t [5] - Voltar para o Menu");
				System.out.print("\n\t   Escolha a opção desejada: ");

				try {
					opcoesConta = leia.nextInt();
				} catch (InputMismatchException e) {
					System.out.println(Cores.TEXT_RED_BOLD + "\n\tDigite valores inteiro!");
					leia.nextLine();
					opcoesConta = 0;
				}

				switch (opcoesConta) {
				case 1:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\t    Criar Conta");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					contas.criarConta(leia, contas);
					KeyPress();
					break;

				case 2:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\tAtualizar dados da Conta");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					contas.atualizarDadosConta(leia, contas);
					KeyPress();
					break;

				case 3:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\tConsultar Conta");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.print("\tDigite o número da sua conta: ");
					numeroConta = leia.nextInt();
					contas.procurarPorConta(numeroConta);
					KeyPress();
					break;

				case 4:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\tDeletar a Conta");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.print("\tDigite o número da conta: ");
					numeroConta = leia.nextInt();
					contas.deletar(numeroConta);
					pedidos.excluirPedido(numeroConta);
					KeyPress();
					break;

				case 5:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\tVoltando para o Menu...");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					break;

				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\n\t\tOpção Invalida!\n");
					KeyPress();
					break;

				}

			}

			case 2 -> {
				System.out.println("\t [1] - Fazer Pedido");
				System.out.println("\t [2] - Acompanhe seu pedido");
				System.out.println("\t [3] - Deletar pedidos");
				System.out.println("\t [4] - Voltar para o Menu");
				System.out.println(" ______________________________________________________");
				System.out.print("\n\t    Escolha a opção desejada: ");

				try {
					opcoesPedido = leia.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("\n\tDigite valores inteiro!");
					leia.nextLine();
					opcoesPedido = 0;
				}

				switch (opcoesPedido) {
				case 1:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\t     Faça seu Pedido");
					System.out.println("                                                       ");
					System.out.println(" ------------------------------------------------------");
					pedidos.facaPedido();
					KeyPress();
					break;

				case 2:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\tAcompanhe seu pedido");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.print("\tDigite o número do Pedido: ");
					numeroPedido = leia.nextInt();
					pedidos.listarPedido(numeroPedido);
					contas.procurarPorConta(numeroPedido);
					KeyPress();
					break;

				case 3:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\tDeletar Pedidos");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.print("\tDigite o número do Pedido: ");
					numeroPedido = leia.nextInt();
					pedidos.excluirPedido(numeroPedido);
					KeyPress();
					break;

				case 4:
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					System.out.println("\t\tVoltando para o Menu...");
					System.out.println(" ______________________________________________________");
					System.out.println("                                                       ");
					break;

				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\t\tOpção Invalida!\n");
					KeyPress();
					break;

				}

			}
			
			default ->{
				System.out.println(Cores.TEXT_RED_BOLD + "\n\t\tOpção Invalida!\n");
				KeyPress();
				
			}

			}

		}
	}

	public static void KeyPress() {
		try {
			System.out.println(Cores.TEXT_RED_BOLD + "\t\tPressione Enter para Continuar ...");
			System.in.read();
		} catch (IOException e) {
			System.out.println(Cores.TEXT_RED_BOLD + "\tVocê pressionou uma tecla diferente de enter!");
		}

	}

}
