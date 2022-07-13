package aula09;

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

		nome = formatarTexto(nome);
		email = formatarTexto(email);
		
		if (validarNome(nome) == false) {
			System.out.println("Você digitou caractéres inválidos, no nome.");
		} 
		
		if (validarNome(email) == false) {
			System.out.println("Você digitou caractéres inválidos, no e-mail.");
		} 
						
		
		ler.close();

	}

	public static String formatarTexto(String texto) {
		// esse método deverá tratar o texto, removendo os espaços vazios, do início, do
		// final e do meio.
		// método para ser chamado depois do nextline
		texto = texto.trim();
		while (texto.contains("  ")) {
			texto = texto.replace("  ", " ");
		}
		return texto;
	}

	public static String formatarNome(String nome) {
// ainda não difinido
		return nome;
	}

	public static boolean validarNome(String texto) {
		
//		Verifique se o nome contém caracteres inválidos.	
//		Lista de alguns caracteres inválidos:  ç ~  ã õ - /  | \ # $ % ¨&  *  (   )  + =.
		int contInvalidos = 0;
		for (int i = 0; i < texto.length(); i++) {
			int aux = texto.charAt(i);
			switch (aux) {
			case 'ç':
			case '~':
			case '.':
			case ',':
			case '$':
			case '#':
				contInvalidos++;
				break;
			}

		}
		if (contInvalidos == 0) {
			return true;
		} else {
			return false;
		}
	}
}