package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ControllerConta;

public class TesteCadastro {

	public static void main(String[] args) {
		ControllerConta contas = new ControllerConta ();
		int opcoesMenu, numeroConta;
		
		Scanner leia = new Scanner(System.in);
		
		while (true) {
			System.out.println();
			System.out.println(" ______________________________________________________");
			System.out.println("                                                       ");
			//nome temporário, até decidir um;
			System.out.println("\t\t Pizzaria Ai que Massa");
			System.out.println(" ______________________________________________________");
			System.out.println("\n\t\t\t MENU\n");
			System.out.println("\t [1] - Criar Conta ");
			System.out.println("\t [2] - Consulte sua Conta");
			System.out.println("\t [3] - Atualizar Dados da Conta");
			System.out.println("\t [4] - Fazer Pedido");
			System.out.println("\t [5] - Acompanhe seu pedido");
			System.out.println("\t [6] - Deletar Conta");
			System.out.println("\t [7] - Lista de todas as Contas");
			System.out.println("\t [8] - Sair");
			System.out.println(" ______________________________________________________");
			System.out.print("\n\tEscolha a opção desejada: ");

			try {
				opcoesMenu = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiro!");
				leia.nextLine();
				opcoesMenu = 0;
			}

			if (opcoesMenu == 8) {
				System.out.println("\n\tAGRADECEMOS SUA PREFERÊNCIA");
				System.out.println("\tEQUIPE Pizzaria ai que massa");

				leia.close();
				System.exit(0);
			}

			switch (opcoesMenu) {
			case 1:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\t\t Criar Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				contas.criarConta(leia, contas);
				KeyPress();
				break;
			case 2:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tConsulte sua Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.print("\tDigite o número da sua conta: ");
				numeroConta = leia.nextInt();
				contas.procurarPorConta(numeroConta);
				KeyPress();
				break;
			
			case 3:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tAtualizar dados da Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				contas.atualizarDadosConta(leia, contas);
				KeyPress();
				break;
		
			case 4:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tFaça seu Pedido");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				
		
			case 5:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tAcompanhe seu pedido");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				KeyPress();
				break;
		
			case 6:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tDeletar a Conta");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.print("\tDigite o número da conta: ");
				numeroConta = leia.nextInt();
				contas.deletar(numeroConta);
				KeyPress();
				break;
				
			case 7:
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				System.out.println("\t\tListar todas as contas");
				System.out.println(" ______________________________________________________");
				System.out.println("                                                       ");
				contas.listarTodasContas();
				KeyPress();
				break;
				
			default:
				System.out.println("\n\t\tOpção Invalida!\n");
				KeyPress();
				break;
			}
		}
}
	public static void KeyPress() {
		try {
			System.out.println("\n\n\tPressione Enter para Continuar ...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("\tVocê pressionou uma tecla diferente de enter!");
		}
		
	}

}
