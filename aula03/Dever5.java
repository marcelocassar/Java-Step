package aula03;

import java.util.Scanner;

public class Dever5 {

	public static void main(String[] args) {
//		4-	Faça um programa em Java para ler um caracter. 
//		O programa deverá verificar se o caracter 
//		digitado é consoante (usar switch).

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um caractere");

		String texto = ler.nextLine();

		int vogais = contarVogais(texto);
		int consoantes = contarConsoantes(texto);

		System.out.println("Voce digitou: " + vogais + " vogais e " + consoantes + " consoantes.");
		ler.close();
	}

	public static int contarVogais(String texto) {

		int contVogais = 0;

		for (int i = 0; i < texto.length(); i++) {

			char aux = texto.charAt(i);
			switch (aux) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':

				contVogais++;
			}
		}
		return contVogais;
	}

	public static int contarConsoantes(String texto) {
		int contConsoantes = 0;
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
			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'X':
			case 'Y':
			case 'W':
			case 'Z':

				contConsoantes++;
			}
		}
		return contConsoantes;
	}
}
