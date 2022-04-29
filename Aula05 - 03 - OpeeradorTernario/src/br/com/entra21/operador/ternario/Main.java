package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre operador ternário");

		String nome;
		boolean condicao = false;

		nome = (true) ? "nome" : "sobrenome";

		System.out.println("Então vc é " + (condicao ? "de maior" : "de menor"));

		byte idade = 30;

		System.out.println("vc é " + (idade > 17 ? "de maior" : "de menor"));

	}

}
