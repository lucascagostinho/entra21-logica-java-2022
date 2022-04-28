package br.com.entra21.preco.custo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nomeProduto;
		float precoCusto;
		float precoVenda;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do produto");
		nomeProduto = entrada.nextLine();// nextLine caso o input tenho espaço, não irá dar erro, apenas next não aceita
											// espaço

		System.out.println("Infome o preco de custo");
		precoCusto = entrada.nextFloat();

		precoVenda = precoCusto + (precoCusto * 65 / 100);

		System.out.println("Produto: " + nomeProduto + "\n preço venda: " + precoVenda);

	}

}
