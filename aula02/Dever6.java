package aula02;

import java.util.Scanner;

public class Dever6 {

	public static void main(String[] args) {
//		Faça um programa em Java, para imprimir na tela um menu, conforme o exemplo abaixo. 
//		O usuário deverá digitar a opção desejada 
//		e o programa deverá imprimir na tela o valor da opção escolhida.  
//		Menu / Escolha uma das opções abaixo: / 1 – para somar. / 2 – para subtrair. / 
//		3 -  para multiplicar. / 4 – parar dividir. / 5 -  para sair.
	
	System.out.println("Menu");
	System.out.println("Escolha as opções abaixo:");
	System.out.println("1 – para somar. / 2 – para subtrair / 3 -  para multiplicar / 4 – parar dividir. / 5 -  para sair.");

	Scanner ler = new Scanner(System.in);
	int opcao = ler.nextInt();
	
	switch (opcao) {
	
	case 1:

		System.out.println("Você Digitou 1 - Somar.");
		
	break;
	
	case 2:

		System.out.println("Você Digitou 2 - Subtrair.");
		
	break;
	
	case 3:

		System.out.println("Você Digitou 3 - Multiplicar.");
		
	break;

	case 4:

		System.out.println("Você Digitou 4 - Dividir.");
		
	break;

	case 5:

		System.out.println("Você Digitou 5 - Sair.");
		
	break;

		
	}
	
	ler.close();
	
	}

}
