package conta.controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import conta.model.CadastroCliente;
import conta.model.Cliente;
import conta.repository.InterfacePizzaria;



public class ControllerConta implements InterfacePizzaria{
	Scanner leia = new Scanner(System.in);
	private ArrayList<CadastroCliente> listaConta = new ArrayList<CadastroCliente>();
	int numeroConta = 0;
	Random gerador = new Random();
	
	//procura pela conta informada pelo usuario
	@Override
	public void procurarPorConta(int numeroConta) {
		var conta = buscarNaListaConta(numeroConta);
		
		if (conta != null)
			conta.statusConta();
		else
			System.out.println("\n\tA conta número: " +  numeroConta + " não foi encontrada!");
	}
	//Lista de todos os pedidos inseridos
	
	
	//lista todas as contas cadastradas
	@Override
	public void listarTodasContas() {
		
		for (var conta : listaConta) {
			conta.statusConta();
		}
		
	}
	
	
	//adiciona o cliente e seus dados na lista
	@Override
	public void cadastrar(CadastroCliente conta) {
		listaConta.add(conta);
		System.out.println("\n\tA Conta numero: " + conta.getNumeroConta() + " foi criada com sucesso!");
		
	}
	
	
	//atualiza a conta com os dados informados pelo usuario
	@Override
	public void atualizar(CadastroCliente conta) {
		var buscaConta = buscarNaListaConta(conta.getNumeroConta());
		
		if(buscaConta != null) {
			listaConta.set(listaConta.indexOf(buscaConta), conta);	
			System.out.println("\n\tA Conta número: " + conta.getNumeroConta() + " foi atualizada com sucesso!");
			
		}else 
			System.out.println("\nA\t Conta número: " + conta.getNumeroConta() + " não foi encontrada!");
		
		
	}
	
	
	//deleta a conta informada
	@Override
	public void deletar(int numeroConta) {
		var conta = buscarNaListaConta(numeroConta);
		
		if(conta != null) {
			if(listaConta.remove(conta) == true) {
				System.out.println("\n\tA conta número: " + numeroConta + " foi deletada com sucesso!");
			}else 
				System.out.println("\n\tA conta número : " + numeroConta + " não foi encontrada!");
		}
		
		
	}
	
	
	
	//gerar numero da conta
	public int gerarNumero() {
		//return gerador.nextInt(26);
		return ++ numeroConta;
	}

	
	//percorre toda a lista e encontra a conta informada
	public CadastroCliente buscarNaListaConta(int numeroConta) {
		for (var conta : listaConta) {
			if(conta.getNumeroConta() == numeroConta) {
				return conta;
			}
		}
		return null;
	}
	
	
	//Metodo para pedir dados do cliente para criar a conta
	public void criarConta(Scanner leia, ControllerConta contas) {
        int numeroConta;
        String nome, telefone, email, bairro, rua, complementoResidencia;
        int numeroResidencia;
    
        leia.skip("\\R?");
		System.out.print("\tDigite seu nome: ");
		nome = leia.nextLine();
		System.out.print("\tDigite seu telefone: ");
		telefone = leia.nextLine();
		
		System.out.print("\tDigite seu email: ");
		email = leia.nextLine(); 
		
		System.out.print("\tDigite seu bairro: ");
		bairro = leia.nextLine(); 
		
		System.out.print("\tDigite sua rua: ");
		rua = leia.nextLine(); 
		
		System.out.print("\tDigite o número da residencia: ");
		numeroResidencia = leia.nextInt(); 
		leia.skip("\\R?");
		
		System.out.print("\tDigite o complemento da residencia: ");
		complementoResidencia = leia.nextLine(); 
		numeroConta = contas.gerarNumero();
	
		contas.cadastrar(new Cliente(numeroConta, nome, telefone, email, bairro, rua, numeroResidencia, complementoResidencia));
	}
	
	//Atualiza os dados da conta quando chamado no menu
	public void atualizarDadosConta(Scanner leia, ControllerConta contas) {
        int numeroConta;
        String nome, telefone, email, bairro, rua, complementoResidencia;
        int numeroResidencia;
        
        System.out.print("\tDigite o número da conta: ");
        numeroConta = leia.nextInt();
    
        if (contas.buscarNaListaConta(numeroConta) != null) {
            leia.skip("\\R?");
            System.out.print("\tDigite seu nome: ");
            nome = leia.nextLine();
            System.out.print("\tDigite seu telefone: ");
            telefone = leia.nextLine();
            
            System.out.print("\tDigite seu email: ");
            email = leia.nextLine(); 
            
            System.out.print("\tDigite seu bairro: ");
            bairro = leia.nextLine(); 
            
            System.out.print("\tDigite sua rua: ");
            rua = leia.nextLine(); 
            
            System.out.print("\tDigite o número da residencia: ");
            numeroResidencia = leia.nextInt(); 
            leia.skip("\\R?");
            
            System.out.print("\tDigite o complemento da residencia: ");
            complementoResidencia = leia.nextLine(); 	
            contas.atualizar(new Cliente(numeroConta, nome, telefone, email, bairro, rua, numeroResidencia, complementoResidencia));
        } else { 
            System.out.println("Conta não encontrada!");
        }
        
        
    }
	


	
}
	
	
	

