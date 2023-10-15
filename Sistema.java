package Praticando;

public class Sistema {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Felipe Celestino");
		Compra compra = new Compra();
		
		compra.itens.add(new Produto("Durateston", 20),8);
	}
}
