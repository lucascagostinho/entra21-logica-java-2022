package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre operador tern�rio");

		String nome;
		boolean condicao = false;

		nome = (true) ? "nome" : "sobrenome";

		System.out.println("Ent�o vc � " + (condicao ? "de maior" : "de menor"));

		byte idade = 30;

		System.out.println("vc � " + (idade > 17 ? "de maior" : "de menor"));

	}

}
