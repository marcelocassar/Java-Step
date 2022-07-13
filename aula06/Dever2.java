package aula06;

import java.util.Scanner;
import java.util.Random;

public class Dever2 {

	public static void main(String[] args) {
		/*
		 * 2 - Faça um programa em Java para ler 30 números inteiros randômicos.
		 * Armazene todos os números em um vetor. Após inserir todos os valores, faça •
		 * Imprima todos os 30 números na ordem que foram armazenados. • Imprima todos
		 * os 30 números na ordem inversa que foram armazenados. • Exiba o valor do
		 * maior número digitado. • Exiba o valor do menor número digitado. • Informe a
		 * soma de todos os valores. • Exibir quantos números armazenados são pares.
		 */

		Random random = new Random();

		int vet[] = new int[30];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = random.nextInt(30);
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("O valor do " + (i + 1) + "º número é " + vet[i]);
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

		int pares = 0;

		for (int i = 0; i < vet.length; i++) {
			if (vet[i]%2 == 0) {
				pares++;
			}

		}
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);
		System.out.println("A soma total é " + total);
		System.out.println("o número total de pares é " + pares);
	}

}