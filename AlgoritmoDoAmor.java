package br.ucsal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlgoritmoDoAmor {

	public static void main(String[] args) {
		int idade=receberIdade();
		String output=output(idade);
		int inicio=inicio(output);
		int fim=fim(output);
		
		imprimir(output, idade, inicio, fim);

	}
	private static String output(int idade) {
		String output="";
		
		if(idade>= 20 && idade<= 30) {output="Voc� � o maior presente que Deus poderia me dar. Te amo hoje e sempre!";}
		if(idade>= 31 && idade<= 40) {output="Minha felicidade n�o tem pre�o, tem o seu nome.";}
		if(idade>= 41 && idade<= 50) {output="Quando eu notei, j� era amor, eu n�o imaginava.";}
		if(idade>=51) {output="Estranho seria se eu n�o me apaixonasse por voc�!";}
		if(idade<=19) {output="Por mais que eu n�o esteja do seu lado agora, era onde eu mais queria estar.";}
		
		return output;
		}
	private static int receberIdade() {
		Scanner ed=scanner();
		int idade=0;
		
			System.out.println("Informe sua idade");
			try {idade=ed.nextInt();}
			
			catch(InputMismatchException e) {
				System.out.println("Invalido!!");
				receberIdade();
			}
			
		return idade;
	}
	
	private static int inicio(String output) {
		int inicio=0;
		if(output.equals("Voc� � o maior presente que Deus poderia me dar. Te amo hoje e sempre!")) {inicio=20;}
		if(output.equals("Minha felicidade n�o tem pre�o, tem o seu nome.")) { inicio=31 ;}
		if(output.equals("Quando eu notei, j� era amor, eu n�o imaginava.")) {inicio=41 ;}
		if(output.equals("Estranho seria se eu n�o me apaixonasse por voc�!")) {inicio=51 ;}
		if(output.equals("Por mais que eu n�o esteja do seu lado agora, era onde eu mais queria estar.")) {inicio=0 ;}
		
		return inicio;
	}
	private static int fim(String output) {
		int fim=0;
		if(output.equals("Voc� � o maior presente que Deus poderia me dar. Te amo hoje e sempre!")) {fim=30;}
		if(output.equals("Minha felicidade n�o tem pre�o, tem o seu nome.")) {fim=40 ;}
		if(output.equals("Quando eu notei, j� era amor, eu n�o imaginava.")) {fim=50 ;}
		if(output.equals("Estranho seria se eu n�o me apaixonasse por voc�!")) {fim=0 ;}
		if(output.equals("Por mais que eu n�o esteja do seu lado agora, era onde eu mais queria estar.")) {fim=19 ;}
		
		return fim;
	}
	private static Scanner scanner() {
		Scanner ed=new Scanner(System.in);
		return ed;
	}
	private static void imprimir(String output, int idade, int inicio, int fim) {
		
		System.out.println("Idade informada: "+idade); 
		if(inicio>=51) {
			System.out.println("Faixa etaria: "+inicio+">");
		}else {
			System.out.println("Faixa etaria: "+inicio+" a "+fim); 
		}
		System.out.println("Frase: "+output);
	}
}

