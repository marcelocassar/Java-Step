package aula06;

import java.util.Scanner;

public class Dever1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vet[] = new int[12];
		Scanner ler = new Scanner(System.in);
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número :");
			vet[i] = ler.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("O valor do " + (i + 1) + "º número é " + vet[1]);
		}

		for (int i = vet.length - 1; i >= 0; i--) {
			System.out.println("O valor do " + (i + 1) + " º número é o " + vet[i]);
		}
		int maior = vet[0];

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}

		int menor = vet[0];

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < menor) {
				menor = vet[i];
			}
		}

		int total = 0;

		for (int i = 0; i < vet.length; i++) {
			total = total + vet[i];
		}

		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);
		System.out.println("O total é " + total);
	}

}