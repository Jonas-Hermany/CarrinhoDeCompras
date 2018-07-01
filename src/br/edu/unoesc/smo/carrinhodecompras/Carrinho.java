package br.edu.unoesc.smo.carrinhodecompras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrinho {

	Double valorTotal = 0.0;

	private List<Produto> itens;

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	private class ordenacaoCrescente implements Comparator<Produto> {
		@Override
		public int compare(Produto p1, Produto p2) {
			if (p1.getValor() > p2.getValor()) {
				return 1;
			} else if (p1.getValor() < p2.getValor()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	private class ordenacaoDecrescente implements Comparator<Produto> {
		@Override
		public int compare(Produto p1, Produto p2) {
			if (p1.getValor() < p2.getValor()) {
				return 1;
			} else if (p1.getValor() > p2.getValor()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public List<Produto> produtosOrdemCrescente() {
		this.itens.sort(new ordenacaoCrescente());
		return this.itens;
	}

	public List<Produto> produtosOrdemDecrescente() {
		this.itens.sort(new ordenacaoDecrescente());
		return this.itens;
	}

	public Double valorTotalCarrinho() {
		itens.forEach(i -> {
			valorTotal += i.getTipoProduto().calcular(i);
		});

		return valorTotal;
	}

	public void adcionarAoCarrinho(Produto produto, int qtdItens) {
		if (itens == null) {
			itens = new ArrayList<>();
		}

		for (int i = 1; i <= qtdItens; i++) {
			itens.add(produto);
		}

	}
}
