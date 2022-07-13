package aula07;

public class Dever5 {

	public static void main(String[] args) {
		/*
		 * 5. Faça um programa em Java para gerar um vetor de 40 posições de números
		 * inteiros randômicos. Exiba na tela cada valor gerado (indice e valor). Ordene
		 * o vetor na ordem crescente e reimprima todos os elementos do vetor.
		 */

		int vet[] = new int[40];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println(" O " + (i+1) + "º número é :" + vet[i] + ".");
		}
		
		// crescente
		
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
