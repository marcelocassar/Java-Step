package aula07;

public class Dever02 {

	public static void main(String[] args) {
		/*
		 * 2. Faça um programa em Java para gerar um vetor com 25 posições de números
		 * inteiros randômicos. Imprima na tela sua posição e o valor armazenado no
		 * vetor.
		 */

		int vet[] = new int[25];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < vet.length; i++) {
			System.out
					.println(" O item armazenado é " + vet[i] + " que representa o " + (i + 1) + " º número digitado.");
		}

	}

}
