package br.ucsal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
	static Scanner scan = new Scanner(System.in);
	static float a = 0, b =0;
	static int indice = 0;
	static DecimalFormat formatador = new DecimalFormat("0.0");

	public static void main(String[] args) {
		operacao();
	}


	private static void operacao() {
		indice=0;
		while(true) {
			System.out.println("Qual operação?\n1- Soma\n2- Subtração \n3- Multiplicação\n4- Divisão");
			try {
				indice=scan.nextInt();
				escolha();
			}catch(Exception erro) {
				System.out.println("Invalido, tente novamente");
				scan.nextLine();
				operacao();
			}
		}

	}


	private static void escolha() {
		switch (indice) {
		case 1:
			soma();
		case 2:
			subtracao();
		case 3:	
			multiplicacao();
		case 4: 
			divisao();
		default:
			System.out.println("Erro");
			operacao(); 
			break;
		}

	}

	private static void divisao() {
		System.out.println("1º numero");
		a = scan.nextFloat();
		System.out.println("2º numero");
		b = scan.nextFloat();
		float divisao=a / b;
		System.out.println("Resultado: "+ formatador.format(divisao));
		finalizar();
	}


	private static void multiplicacao() {
		System.out.println("1º numero");
		a = scan.nextFloat();
		System.out.println("2º numero");
		b = scan.nextFloat();
		float multiplicacao=a * b;
		System.out.println("Resultado: " + formatador.format(multiplicacao));
		finalizar();

	}


	private static void finalizar() {
		int escolha;
		System.out.println("\nDeseja finalizar?\n1-Sim\n2-Não");
		escolha=scan.nextInt();
		switch (escolha) {
		case 1: {
			System.out.println("Volte sempre!");
			System.exit(0);
		}
		case 2: {
			operacao();
		}
		default:{
			System.out.println("Escolha invalida");
			finalizar();
		}

		}

	}


	private static void subtracao() {
		System.out.println("1º numero");
		a = scan.nextFloat();
		System.out.println("2º numero");
		b = scan.nextFloat();
		float subtracao= a-b;
		System.out.println("Resultado: "+ formatador.format(subtracao));
		finalizar();
	}


	private static void soma() {
		System.out.println("1º numero");
		a = scan.nextFloat();
		System.out.println("2º numero");
		b = scan.nextFloat();
		float soma= a + b;
		System.out.println("Resultado:" + formatador.format(soma));
		finalizar();

	}

}
