package aula07;

public class Dever4 {

	public static void main(String[] args) {
		/*
		 * 4. Faça um programa em Java para gerar um vetor de 20 posições de números
		 * inteiros randômicos. Exiba na tela o maior valor encontrado, o menor valor e
		 * a média geral.
		 */
		int vet[] = new int[20];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = (int) (Math.random() * 100);
		}

		// maior

		int maior = vet[0];
		for (int i = 0; i < vet.length; i++) {
			if (maior < vet[i]) {
				maior = vet[i];
			}
		}

		// menor

		int menor = vet[0];

		for (int i = 0; i < vet.length; i++) {

			if (menor > vet[i]) {
				menor = vet[i];
			}
		}
		
		// media
		int total = 0;
		for (int i = 0; i < vet.length ; i++) {
			total = total + vet[i]; 
		}
		
		for (int i = 0; i < vet.length; ++i) {
			System.out.print(vet[i] + " ");
		}
		System.out.println();
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(total);

	}

}
