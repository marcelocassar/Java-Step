package aula04;

import java.util.Scanner;

public class Dever01 {

	// 1. Faça um programa em Java para desenhar um quadrado de @. O usuário deverá
	// informar o tamanho do quadrado. 4x4

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a altura:");
		int altura = ler.nextInt();

		System.out.println("Informe a base:");
		int base = ler.nextInt();
		desenhoQuadrado(altura, base);
		desenhoTriangulo(altura,base);
		
	}

	public static int areaQuadrado(int altura, int base) {
		return altura * base;
	}

	public static String desenhoQuadrado(int altura, int base) {
		for (int i = 1; i <= altura; i++) {
			if (i == 1) {
				for (int j = 1; j <= base + 2; j++) {
					System.out.print("█");
				}
			}

			if (i != 1 || i != altura) {
				System.out.println("");
				System.out.print("█");
				for (int j = 1; j <= base; j++) {
					System.out.print("@");
				}
				System.out.print("█");
			}
			if (i == altura) {
				System.out.println("");

				for (int j = 1; j <= base + 2; j++) {
					System.out.print("█");
				}
			}
		}
		return "";
	}

	public static String desenhoTriangulo(int altura, int base) {

		for (int i = 1; i <= altura; i++) {
			if (i == 1) {
				System.out.println("");
				System.out.print("#");
				
			}

			if (i != 1 || i != altura) {
				System.out.println("");
				System.out.print("█");
				for (int j = 1; i <= base; j++) {
					System.out.print("@");
				}
				System.out.print("█");
			}

			if (i == altura) {
				System.out.print("#");
				System.out.println("");
			}

		}

		return "";
	}

}
