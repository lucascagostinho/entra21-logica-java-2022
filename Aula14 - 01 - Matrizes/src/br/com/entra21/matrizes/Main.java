package br.com.entra21.matrizes;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);
	// definindo minha variável do tipo Scanner acessivel em toda a clesse Main
	// como medo da main é static, tanto metodos ou variaves devem ser static para
	// se relacionarem com o metodo main

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println(escreeverMenuMatrizes());
			opcao = input.nextByte();

			switch (opcao) {
			case 1:
				aprenderMatrizesSimples();
				break;

			case 2:
				aprenderMatrizesInicializadas();
				break;

			case 0:
				System.out.println("Fechando");
				break;

			default:
				break;
			}
		} while (opcao != 0);

	}

	private static String escreeverMenuMatrizes() {

		String conteudoMenu = "Escolha uma opção para aprender: \n";
		conteudoMenu += "1 - Inicializando matrizes com tamanho definidos \n";
		conteudoMenu += "2 - Inicializando matrizes com valores predeterminados \n";
		conteudoMenu += "0 - Sair";
		return conteudoMenu;

	}

	private static void aprenderMatrizesSimples() {
		System.out.println("Aprendeeendo sobre matrizes simples");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos");
		float notas[][];
		notas = new float[10][3];
		// primeiro indice é a quantidade de vertores
		// segundo indice é a capacidade de cada vetor
		// apenas no ultimo infice da criação pela sintaxe ficam os valores

		byte quantidadeAlunos, quantidadeNotas;

		System.out.println("Informe a quantidade de alunos");
		quantidadeAlunos = input.nextByte();

		System.out.println("Informe a quantidade de enotas para cada aluno");
		quantidadeNotas = input.nextByte();

		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (int aluno = 0; aluno < novasNotas.length; aluno++) {
			System.out.println("Nessa posição [" + aluno + "]" + novasNotas[aluno].length + " notas");

			for (int nota = 0; nota < novasNotas[aluno].length; nota++) {
				System.out.println("Valor da nota [" + nota + "] ===>" + novasNotas[aluno][nota]);
			}

		}

	}

	private static void aprenderMatrizesInicializadas() {
		System.out.println("Aprendendo sobre matrizes inicializadas");

		float salarioAlunos[][] = { { 1000, 1250, 2500 }, { 2600, 3500, 4500 }, { 50000, 150000, 2000000 }

		};

	}

}
