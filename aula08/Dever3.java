package aula08;

import java.util.Scanner;

public class Dever3 {

	public static void main(String[] args) {
// 3.	Faça um programa em Java, onde o usuário deverá digitar seu nome completo. 
// O sistema deverá informar seu primeiro nome, sobrenome e nome do meio, caso haja. 
// Trate o nome antes de realizar a extrair as informações;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String texto = ler.nextLine();

		int cont = 0;

		for (int i = 0; i < texto.length(); i++) {
			char aux = texto.charAt(i);
			switch (aux) {
			case '.':
			case ',':
			case ';':
			case ':':
			case '?':
			case '~':
			case '^':
			case '`':
			case '/':
			case '!':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '0':
				cont++;
				break;
			}
		}
		if (cont > 0) {
			System.out.println("Você digitou um caracter não autorizado.");

		}

		int cont1 = 0;
		int aux = 0;
		int contEspacos = 0;
		for (int i = 0; i < texto.length(); i++) {
			aux = texto.charAt(i);
			switch (aux) {
			case ' ':
				cont1++;
				break;
			}
		}

		cont1 = contEspacos;

		String nome, meio, sobrenome;
		nome = texto.substring(0, texto.indexOf(' '));
		sobrenome = texto.substring(texto.indexOf(' '));
		meio = texto.substring(texto.indexOf(' '), texto.lastIndexOf(' '));
		if (contEspacos == 1) {
			meio = "Você não tem nome do meio, pois só tem um sobrenome.";
		}

		System.out.println("Seu nome é : " + nome + ".");
		System.out.println("Seu sobrenome é " + sobrenome + ".");
		System.out.println("Seu nome é : " + meio + ".");

	}

}