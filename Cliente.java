package Praticando;

import java.util.ArrayList;

public class Cliente {
	ArrayList<Compra> compras = new ArrayList<>();
	
	String nome;
	
	Cliente(String nome){
		this.nome = nome;
	}

	double obterValorTotal() {
		double total=0;
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
	
}
