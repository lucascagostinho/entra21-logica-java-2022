package br.com.entra21.lucas.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// Refector > Rename > Alterar nome da variável, caso escrevi errado. Assim
		// altera todas as variaveis usados com aquele nome

		byte idade;
		idade = 25;
		byte outraIdade = 25;

		short ano = 2022;
		short anoPassado;
		anoPassado = 2021;

		int habitantesBrasil = 2120600;

		long habitantesTerra1500 = 7900000;

		float peso = 70.5f, altura = 2.05f;

		double habitantesAtualmente = 790000000.00;

		char caracter = 'R';

		String letras = "Lucas";

		boolean intervaloAntesDasOito = false;
		boolean intervaloDepoisDasOito = true;

		System.out.println(idade + ano);
		System.out.println("Tste " + idade + ano);
		System.out.println("Teste " + (idade + ano));
		System.out.println("Estamos em " + ano + " e ano passodo fou " + anoPassado);

		System.out.println("No Brasil em " + ano + " havim " + habitantesBrasil + " habitantes");

		System.out.println("Meu peso é " + peso + " Minha altura é " + altura);

		String nome;
		byte minhaIdade;
		float minhaAltura, salario;

		Scanner entrada;
		entrada = new Scanner(System.in);

		System.out.println("Digite sua idade");

		minhaIdade = entrada.nextByte();

		System.out.println("Digite seu nome");

		nome = entrada.next();

		System.out.println(nome + idade);

		System.out.println("informe sua altura");
		minhaAltura = entrada.nextFloat();

		System.out.println("Informe seu salário");
		salario = entrada.nextFloat();

		System.out.println(minhaAltura + " " + salario);

		nome = JOptionPane.showInputDialog("Informe novamente seu nome");
		JOptionPane.showMessageDialog(null, nome);

		byte qualQuerIdade = Byte.parseByte(JOptionPane.showInputDialog("Informe sua idade"));
		JOptionPane.showMessageDialog(null, qualQuerIdade);
	}

}
