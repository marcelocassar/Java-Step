package aula07;

public class Dever01 {

	public static void main(String[] args) {
		/*
		 * 1. Faça um programa em Java para gerar um vetor com 50 posições de números
		 * inteiros randômicos. Exiba a lista na ordem inversa de suas posições. ( basta
		 * imprimir do ultimo indice ate o primeiro)
		 */

		int vet[] = new int[50];
		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 100);
		}

		// imprimindo o vetor

		for (int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i]);
		}

		// ordem crescente

		for (int i = 0; i < vet.length - 1; i++) {
			for (int j = i + 1; j < vet.length; j++) {

				if (vet[j] < vet[i]) {
					int aux = vet[j];
					vet[j] = vet[i];
					vet[i] = aux;
				}
			}
		}
		
		System.out.println("");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(" " + vet[i]);
		}

	}
}
