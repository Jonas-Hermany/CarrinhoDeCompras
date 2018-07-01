package br.edu.unoesc.smo.carrinhodecompras.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import br.edu.unoesc.smo.carrinhodecompras.Carrinho;
import br.edu.unoesc.smo.carrinhodecompras.Produto;
import br.edu.unoesc.smo.carrinhodecompras.TipoProduto;

public class CarrinhoTest {
	
	@Test
	public void adcionarAoCarrinhoTest() {
		Carrinho carrinho = new Carrinho();

		Produto produto = new Produto("Cerveja", TipoProduto.BEBIDA, 6.00);
		carrinho.adcionarAoCarrinho(produto, 1);
	}

	@Test
	public void produtosOrdemDescrescenteTest() {
		Carrinho carrinho = new Carrinho();

		Produto produto1 = new Produto("Cerveja", TipoProduto.BEBIDA, 6.0);
		carrinho.adcionarAoCarrinho(produto1, 1);
		Produto produto2 = new Produto("Refrigerante", TipoProduto.BEBIDA, 7.0);
		carrinho.adcionarAoCarrinho(produto2, 1);
		Produto produto3 = new Produto("Camisa", TipoProduto.VESTUARIO, 150.0);
		carrinho.adcionarAoCarrinho(produto3, 1);

		List<Produto> itens = carrinho.produtosOrdemDecrescente();

		assertEquals("Camisa", itens.get(0).getNome());
		assertEquals("Refrigerante", itens.get(1).getNome());
		assertEquals("Cerveja", itens.get(2).getNome());

	}
	
	@Test
	public void produtosOrdemCrescenteTest() {
		Carrinho carrinho = new Carrinho();

		Produto produto1 = new Produto("Cerveja", TipoProduto.BEBIDA, 6.0);
		carrinho.adcionarAoCarrinho(produto1, 1);
		Produto produto2 = new Produto("Refrigerante", TipoProduto.BEBIDA, 7.0);
		carrinho.adcionarAoCarrinho(produto2, 1);
		Produto produto3 = new Produto("Camisa", TipoProduto.VESTUARIO, 150.0);
		carrinho.adcionarAoCarrinho(produto3, 1);

		List<Produto> itens = carrinho.produtosOrdemCrescente();

		assertEquals("Cerveja", itens.get(0).getNome());
		assertEquals("Refrigerante", itens.get(1).getNome());
		assertEquals("Camisa", itens.get(2).getNome());

	}
	
	@Test
	public void valorTotalCarrinhoTest() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto1 = new Produto("Cerveja", TipoProduto.BEBIDA, 6.0);
		carrinho.adcionarAoCarrinho(produto1, 1);
		Produto produto2 = new Produto("Refrigerante", TipoProduto.BEBIDA, 7.0);
		carrinho.adcionarAoCarrinho(produto2, 1);
		Produto produto3 = new Produto("Camisa", TipoProduto.VESTUARIO, 150.0);
		carrinho.adcionarAoCarrinho(produto3, 1);
		
		assertEquals(Double.valueOf(124.85), carrinho.valorTotalCarrinho());
	}
	
	@Test
	public void descontoCincoProcentoBebidaTest() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto1 = new Produto("Suco", TipoProduto.BEBIDA, 8.0);
		carrinho.adcionarAoCarrinho(produto1, 1);
		Produto produto2 = new Produto("Refrigerante", TipoProduto.BEBIDA, 9.0);
		carrinho.adcionarAoCarrinho(produto2, 1);
		
		assertEquals(Double.valueOf(16.15), carrinho.valorTotalCarrinho());
	}
	
	@Test
	public void descontoVinteCincoProcentoVestuarioTest() {
		Carrinho carrinho = new Carrinho();
		
		Produto produto1 = new Produto("Bermuda", TipoProduto.VESTUARIO, 50.0);
		carrinho.adcionarAoCarrinho(produto1, 1);
		Produto produto2 = new Produto("Camiseta", TipoProduto.VESTUARIO, 70.0);
		carrinho.adcionarAoCarrinho(produto2, 1);
		
		assertEquals(Double.valueOf(90.0), carrinho.valorTotalCarrinho());
	}
}
