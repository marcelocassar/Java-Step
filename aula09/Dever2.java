package aula09;

import java.util.Scanner;

public class Dever2 {

	public static void main(String[] args) {
		/**
		 * 2. Faça um programa em Java onde o usuário tenha que digitar uma frase. O
		 * sistema deverá contar quantos caracteres a frase tem. Também deverá informar
		 * quantas vogais e quantas consoantes existem na frase.
		 **/

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma frase");

		String texto = ler.nextLine();
		texto = verificarTexto(texto);
		System.out.println(texto);
		int cont = 0;
		for (int i = 0; i < texto.length(); i++) {
			char aux = texto.charAt(i);
			switch (aux) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				cont++;
				break;
			}

		}

		int cont2 = 0;
		for (int i = 0; i < texto.length(); i++) {
			char aux = texto.charAt(i);
			switch (aux) {

			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'x':
			case 'y':
			case 'w':
			case 'z':

				cont++;
				break;

			}
		}
		System.out.println("O texto possui " + cont + " vogais, possui " + cont2 + " consoantes e " + texto.length()
				+ " caracteres.");
				
	}

	public static String verificarTexto(String texto) {

		return texto.trim().toLowerCase();

	}

}
