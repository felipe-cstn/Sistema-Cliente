package Praticando;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens = new ArrayList<>();
	
	
	double obterValorTotal() {
		double total=0;
		for(Item item: itens) {
			total+=  item.quantidade * produto.preco;
		}
		return total;
	}
}
