package br.com.entra21.exercicio.area.perimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int base;
		int altura;
		int area;
		int perimetro;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o valor da base do perímetro");
		base = entrada.nextInt();

		System.out.println("Informe o valor da altura do perímetro");
		altura = entrada.nextInt();

		area = base * altura;
		perimetro = (base * 2) + (altura * 2);

		System.out.println("O o calculo do area dos valores informados é " + area);
		System.out.println("O o calculo do perímetro dos valores informados é " + perimetro);

	}

}
