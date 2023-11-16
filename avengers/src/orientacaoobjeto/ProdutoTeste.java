package orientacaoobjeto;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto produto = new Produto();
		Produto produto1 = new Produto();
		
		produto.nome = "Mac Mini";
		produto.preco  = 7499.00;
		produto.desconto = 0.10;
		
		produto1.nome = "Iphone 15 Pro Max";
		produto1.preco  = 2200.00;
		produto1.desconto = 0.20;
		
		double precoFinal1 = produto.preco * (1 - produto.desconto);
		double precoFinal2 = produto.precoComDesconto();
		double precoFinalGerente = produto.precoComDesconto(0.3);
		
		double precoFinal3 = produto1.preco * (1 - produto1.desconto);
		double precoFinal4 = produto1.precoComDesconto();
		double precoFinalGerente1 = produto1.precoComDesconto(0.3);
		
		System.out.printf("Preço: R$%.2f\n", precoFinal1);
		System.out.printf("Preço: R$%.2f\n", precoFinal2);
		System.out.printf("Preço: R$%.2f\n", precoFinalGerente);
		
		System.out.printf("Preço: R$%.2f\n", precoFinal4);
		System.out.printf("Preço: R$%.2f\n", precoFinal3);
		System.out.printf("Preço: R$%.2f\n", precoFinalGerente1);
	}

}
