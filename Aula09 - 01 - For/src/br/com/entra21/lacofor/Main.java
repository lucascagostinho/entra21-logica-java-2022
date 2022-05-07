package br.com.entra21.lacofor;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Informe qual tabuada você quere saber");
		retornarTabuada(input.nextInt());

		// A variável contador só é válida dentro do escopo dela

		// algumas formas de fazer o for

		System.out.println("Aprendendo sobre for");

		for (int contador = 0; contador <= 10; contador = contador + 1) {

			System.out.println("Repitindo " + contador);

		}

		for (int contador = 0; contador <= 10; contador += 2) {

			System.out.println("Repetindo " + contador);

		}

		for (int contador = 0; contador <= 10; contador++) {

			System.out.println("Repetindo " + contador);

		}

		for (int contador = 4; contador <= 10; contador += 2) {

			System.out.println("Repetindo " + contador);

		}

		for (int contador = 10; contador >= 1; contador--) {

			System.out.println("Decremento: " + contador);

		}

		// forma de fazer a tabuada com for
		int numero = 3;
		int contador;

		for (contador = 1; contador <= 10; contador++) {

			System.out.println("Contador dentro do escopo " + contador + " x " + numero + " = " + (contador * numero));

		}

		System.out.println("Como o contador ficou criando o contador fora do escopo " + contador);

	}

	public static void retornarTabuada(int numero) {

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println(numero + "x" + contador + "=" + (contador * numero));

		}
		
	}

}
