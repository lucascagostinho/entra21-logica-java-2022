package br.com.entra21.preco.custo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nomeProduto;
		float precoCusto;
		float precoVenda;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do produto");
		nomeProduto = entrada.nextLine();// nextLine caso o input tenho espa�o, n�o ir� dar erro, apenas next n�o aceita
											// espa�o

		System.out.println("Infome o preco de custo");
		precoCusto = entrada.nextFloat();

		precoVenda = precoCusto + (precoCusto * 65 / 100);

		System.out.println("Produto: " + nomeProduto + "\n pre�o venda: " + precoVenda);

	}

}
