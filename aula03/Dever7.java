package aula03;

import java.util.Scanner;

public class Dever7 {

	public static void main(String[] args) {
		// 7. Faça um programa em Java para ler um caracter.
		// O programa deverá verificar se o caracter digitado
		// é vogal, consoante ou número (usar switch).
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite qualquer caracter (apenas 1).");
		
		String contador = ler.next();
		
		int vogais = contarVogais(contador);
		int numeros = contarNumeros(contador);
		int consoantes = contarConsoantes(contador);
		
		if (vogais == 1) {
			System.out.println("Você digitou uma vogal");
		} else {
			if (consoantes == 1) {
				System.out.println("Você digitou uma consoantes");
			} else {
				if (numeros ==1) {
					System.out.println("Você digitou um numero");
				} else {
					if (numeros == 0 && consoantes == 0 && numeros ==0) {
						System.out.println("Você não digitou número,vogal ou consoante.");
					}
				}
			}
		}
		
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

	public static int contarNumeros(String texto) {
		int contarNumeros = 0;

		for (int i = 0; i < texto.length(); i++) {
			int aux = texto.charAt(i);
			switch (aux) {
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
				contarNumeros++;
			}
		}
		return contarNumeros;

	}

}
