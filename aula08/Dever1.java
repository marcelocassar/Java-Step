package aula08;

import java.util.Scanner;

public class Dever1 {

	public static void main(String[] args) {
//		Faça um programa em Java para armazenar o nome e o email do usuário. 
//		O usuário deverá digitar o nome e o e-mail. Valide o e-mail digitado. 
//		Verifique se o nome e o email contém caracteres inválidos. 
//		Lista de alguns caracteres inválidos:  ç ~  ã õ - /  | \ # $ % ¨&  *  (   )  + =. 

		Scanner ler = new Scanner(System.in);

		String nome, email;

		System.out.println("Digite seu nome");		

		nome = ler.nextLine();
		
		System.out.println("Digite seu e-mail");
		
		email = ler.nextLine();
		
		
		nome = nome.trim();
		nome = nome.toLowerCase();

		int cont1 = 0;
		int cont = 0;

		verificarCarac(nome);

		if (cont1 == 0) {
			System.out.println("Não existem erros, no nome");
		} else {
			System.out.println("Foram encontrados " + cont + " erros no nome");
		}

		System.out.println("");
		email = ler.nextLine();
		email = email.trim();
		email = email.toLowerCase();

		verificarCarac(email);

		if (cont1 == 0) {
			System.out.println("Não existem erros, no email");
		} else {
			System.out.println("Foram encontrados " + cont + " erros no email");
		}

		ler.close();

	}

	public static int verificarCarac(String email) {
		int cont1 = 0;
		for (int i = 0; i < email.length(); i++) {
			char aux = email.charAt(i);

			switch (aux) {

			case 'ç':
			case '"':
			case '~':
			case 'ã':
			case '/':
			case '-':
			case '|':
			case '#':
			case '&':
			case '*':

				cont1++;
				break;
			}

		}
		return cont1;
	}
}