package cardapio;

public class CardapioMenu {
	private int codigo = 0;
	private String sabor = "";
	private float valor = 0;
	private String ingredientes= "";
	
	public CardapioMenu(int codigo, String sabor, float valor, String ingredientes) {
		this.codigo = codigo;
		this.sabor = sabor;
		this.valor = valor;
		this.ingredientes = ingredientes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public void visualizar() {
		
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
}
}