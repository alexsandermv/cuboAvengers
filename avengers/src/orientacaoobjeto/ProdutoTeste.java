package orientacaoobjeto;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto produto = new Produto();
		Produto produto1 = new Produto();
		
		produto.nome = "Mac Mini";
		produto.preco  = 7499.00;
		produto.desconto = 0.10;
		
		produto1.nome = "Iphone 15 Pro Max";
		produto1.preco  = 9499.00;
		produto1.desconto = 0.10;
		
		
		System.out.println("Nome do Produto: " + produto.nome);
		System.out.printf("Preço: R$%.2f\n", produto.preco);
		System.out.println("Desconto: " + produto.desconto);
		
		System.out.println("Nome do Produto: " + produto1.nome);
		System.out.printf("Preço: R$%.2f\n", produto1.preco);
		System.out.println("Desconto: " + produto1.desconto);
	}

}
