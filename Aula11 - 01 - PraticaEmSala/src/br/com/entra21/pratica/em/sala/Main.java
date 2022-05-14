package br.com.entra21.pratica.em.sala;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String option;

		do {

			System.out.println("\nEscolha uma das opções");
			System.out.println("0 - Sair");
			System.out.println("1 - Calculando a soma");
			System.out.println("2 - Repetir 20 vezes");
			System.out.println("3 - Entre 20 pessoas, exiba a soma das idades");
			System.out.println("4 - Entre 20 pessoas, quantas são de maior");
			System.out.println("5 - Exibir a pessoa mais nova");
			System.out.println("8 - Capture números ee só pare quando fpr digitado um valor negativo");
			System.out.println("9 - Solicite a quantidade de notas e calcule a média ");
			option = input.nextLine();

			switch (option) {

			case "0":
				System.out.println("Saindo");

				break;

			case "1":
				calculandoASoma();

				break;

			case "2":
				repetirVinteVezes();

				break;

			case "3":
				somaIdade();

				break;

			case "4":
				maiorDeIdade();
				break;

			case "5":
				exibirMaisNovo();

				break;

			case "8":
				exerciseOito();

				break;

			case "9":
				calcularMedia();

				break;

			default:
				System.out.println("Favor escolher uma opção válida");
				break;
			}

		} while (option.equals("0") == false); // !option.equals("0") == false) dessa forma nega a operação
		// fazendo comparação de string com equals. podereia usar != 0 caso a variável
		// fosse inteiro ou byte
		System.out.println("Obrigado por usar o programa lista de exercícios");

	}

	public static void calculandoASoma() {

		System.out.println("Calculando a soma");

		int sun = 0;

		for (int counter = 1; counter <= 15; counter++) {
			System.out.println("Soma = " + sun + "+" + sun + "+" + counter);

			sun = sun + counter;

			System.out.println("n°:" + counter + " soma: " + sun);
		}

	}

	public static void repetirVinteVezes() {

		System.out.println("Repetindo 20 vezes e quebrar a linha a cada 5");

		for (int contador = 1; contador <= 20; contador++) {

			System.out.print("|" + (contador % 5 == 0 ? "\n" : " "));
			// sem usar o println e criar grids quanto o contador for 5, ele vai dividir por
			// 5 e vai dar 0 e dar a quebra de linha se não, só dá um espaço
		}
	}

	public static void maiorDeIdade() {
		System.out.println("Exibe os maiores de idade");

		int idade;
		int maiorDeIdade = 0;
		int contador;
		Scanner entrada = new Scanner(System.in);

		for (contador = 1; contador <= 5; contador++) {
			System.out.println("Informe sua idade");
			idade = entrada.nextInt();

			if (idade >= 18) {
				maiorDeIdade++;
			}

		}

		System.out.println("Entre " + (contador) + ", " + maiorDeIdade + " são maior de idade");

	}

	public static void somaIdade() {
		System.out.println("Somando idade");

		Scanner entrada = new Scanner(System.in);
		int idade;
		int somaIdade = 0;

		for (int contador = 1; contador <= 5; contador++) {
			System.out.println("informe sua idade");
			idade = entrada.nextInt();
			somaIdade = somaIdade + idade;

		}

		System.out.println("A soma de todas as iddade é igual" + somaIdade);

	}

	public static void exibirMaisNovo() {

		Scanner input = new Scanner(System.in);
		String nome, nomeMaisNovo = null;
		int idade, idadeMaisNovo = 0;

		for (int count = 1; count <= 10; count++) {
			System.out.println("Informe o o nome da pessoa");
			nome = input.next();

			System.out.println("Informe a idade da pessoa:");
			idade = input.nextInt();

			// no primeiro laço a primeira idadee sempre vai seer a meenor
			if (count == 1) {

				idadeMaisNovo = idade;
				nomeMaisNovo = nome;
				System.out.println("Sou o primeiro por isso sou mais novo" + nome + idade);

			} else {

				if (idade < idadeMaisNovo) {
					// a partir do segundo laço já tenho como comparar com idade mais novo
					idadeMaisNovo = idade;
					nomeMaisNovo = nome;
					System.out.println("Estou no laço" + count + "e preciso verificar");
					System.out.println("A pessoa mais nova é " + nomeMaisNovo + idadeMaisNovo);
				}

			}

		}

		System.out.println("A pessoa mais nova é: " + nomeMaisNovo + "idade: " + idadeMaisNovo);

	}

	public static void calcularMedia() {
		// to do
		int qtdNotas;
		int somaNotas = 0;
		int contador = 0;
		String resposta;
		Scanner input = new Scanner(System.in);

		do {
			contador++;
			System.out.println("Informe quantas notas irá informar");
			qtdNotas = input.nextInt();

			if (contador >= qtdNotas) {
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("sim")) {
					contador--;
				}
			}

			somaNotas = somaNotas + qtdNotas;

		} while (contador <= qtdNotas);

	}

	public static void exerciseOito() {

		Scanner inPut = new Scanner(System.in);
		int number, sum = 0; // se não inicializa um valor na váriavel ela fica com lixo da memória.

		do {

			System.out.println("What number do you want?");
			number = inPut.nextInt();
			if (number >= 0) {
				sum = sum + number;
			} // somente números positivos serão somados, ou números naturais.

		} while (number >= 0); // enquanto o número for maior que zero repita

		System.out.println("Your sum is: " + sum);

	}

}
