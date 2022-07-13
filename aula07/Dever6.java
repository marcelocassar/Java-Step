package aula07;

import java.util.Scanner;

public class Dever6 {

	public static void main(String[] args) {
		/*
		 * 6. Faça um programa em Java para gerar um vetor de 15 posições de números
		 * inteiros. O usuário deverá informar cada um dos 15 valores. Exiba na tela o
		 * maior, e o menor e o total dos valores do vetor. Ordene os valores
		 * armazenados no vetor na ordem crescente. Reimprima todos os valores do vetor.
		 */

		int vet[] = new int[15];

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite o " + (1 + i) + " valor.");
			vet[i] = ler.nextInt();
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

		System.out.println(total);
		System.out.println(maior);
		System.out.println(menor);

		for (int i = 0; i < vet.length; i++) {
			System.out.println(" O " + (i+1) + " º elemento é :" + vet[i] + ".");
		}

	}
}
