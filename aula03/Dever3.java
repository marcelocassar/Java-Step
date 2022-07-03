package aula03;

import java.util.Scanner;

public class Dever3 {

	public static void main(String[] args) {
//		3-	Faça um programa para ler 4 números double 
//		e diga qual é o menor número (usar operador lógico).

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		double n1 = ler.nextDouble();

		System.out.println("Digite o 2º número: ");
		double n2 = ler.nextDouble();

		System.out.println("Digite o 3º número: ");
		double n3 = ler.nextDouble();

		System.out.println("Digite o 4º número: ");
		double n4 = ler.nextDouble();

		System.out.println("Digite o 5º número: ");
		double n5 = ler.nextDouble();

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
