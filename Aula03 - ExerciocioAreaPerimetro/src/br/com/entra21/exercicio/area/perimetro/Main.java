package br.com.entra21.exercicio.area.perimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int base;
		int altura;
		int area;
		int perimetro;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor da base do per�metro");
		base = entrada.nextInt();

		System.out.println("Informe o valor da altura do per�metro");
		altura = entrada.nextInt();

		area = base * altura;
		perimetro = (base * 2) + (altura * 2);

		System.out.println("O o calculo do area dos valores informados � " + area);
		System.out.println("O o calculo do per�metro dos valores informados � " + perimetro);

	}

}
