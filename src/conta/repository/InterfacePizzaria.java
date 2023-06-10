package conta.repository;

import conta.model.CadastroCliente;

public interface InterfacePizzaria {
		
		//CRUD da Conta
		public void procurarPorPedido(int numeroPedido);
		public void procurarPorConta(int numeroConta);
		public void listarTodosPedidos();
		public void listarTodasContas();
		public void cadastrar(CadastroCliente conta);
		public void atualizar(CadastroCliente conta);
		public void deletar(int numeroConta);
		
		//metodos
		
		public void pagar(int numeroPedido, float valor);
		

	}

	

