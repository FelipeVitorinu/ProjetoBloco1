package conta.repository;

import conta.model.CadastroCliente;

public interface InterfacePizzaria {

	// CRUD
	public void cadastrar(CadastroCliente conta);

	public void listarTodasContas();

	public void atualizar(CadastroCliente conta);

	public void deletar(int numeroConta);

	public void procurarPorPedido(int numeroPedido);

	public void procurarPorConta(int numeroConta);

	public void listarTodosPedidos();

	public void pagar(int numeroPedido, float valor);

}
