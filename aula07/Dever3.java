package aula07;

public class Dever3 {

	public static void main(String[] args) {
/*
 * 3.	Faça um programa em Java para gerar um vetor com 30 posições de números inteiros randômicos. 
 * Imprima na tela somente os números impares desse vetor. ( use como padrão imprima o indice e o valor)
 */
		int vetor[] = new int[30];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]%2 == 1) {
			System.out.println(" O item armazenado é " + vetor[i] + " que representa o " + (i + 1) + " º número digitado.");
		}
		
	}

}
}
