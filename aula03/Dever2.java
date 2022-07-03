package aula03;

import java.util.Scanner;

public class Dever2 {

	public static void main(String[] args) {
//		2-	Faça um programa para ler 5 números inteiros 
//		e diga qual é o maior número (usar operador lógico).

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		int n1 = ler.nextInt();

		System.out.println("Digite o 2º número: ");
		int n2 = ler.nextInt();

		System.out.println("Digite o 3º número: ");
		int n3 = ler.nextInt();

		System.out.println("Digite o 4º número: ");
		int n4 = ler.nextInt();

		System.out.println("Digite o 5º número: ");
		int n5 = ler.nextInt();

		String aux;

		if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5) {
			aux = ("O maior valor é " + n1);
		} else {
			if (n2 >= n3 && n2 >= n4 && n2 >= n5) {
				aux = ("O maior valor é " + n2);
			} else {
				if (n3 >= n4 && n3 >= n5) {
					aux = ("O maior valor é " + n3);
				} else {
					if (n4 >= n5) {
						aux = ("O maior valor é " + n4);
					} else {
						aux = ("O maior valor é " + n5);

					}
				}

			}

		}
		System.out.println(aux);
		ler.close();
	}

}
