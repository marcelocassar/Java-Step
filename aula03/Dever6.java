package aula03;

import java.util.Scanner;

public class Dever6 {

	public static void main(String[] args) {
//		6-	Faça um programa em Java, para o usuário digitar um número inteiro de 1 a 7. 
//		Os números correspondem ao dia da semana. 
//		Exemplo 1- domingo, 2 – segunda e assim por diante. ( fazer usando o comando switch)
		Scanner ler = new Scanner(System.in);
		System.out.println(menu());
		System.out.println("Digite uma opção");
		int opcao = ler.nextInt();

		if (opcao == 1) {
			System.out.println(
					"A história do Domingo - \n Foi a 7 de março do ano 321 que o Imperador Constantino proclamou o domingo como dia de descanso, \n com o objetivo de organizar o calendário semanal. Dia do Deus Sol, \n divindade oficial do Império nesta altura, e que explica a designação utilizada \n pelas línguas germânicas para este dia.");
		} else {
			if (opcao == 2) {
				System.out.println("A história da Segunda");
			} else {
				if (opcao == 3) {
					System.out.println("A história da Terca");
				} else {
					if (opcao == 4) {
						System.out.println("A história da Quarta");
					} else {
						if (opcao == 5) {
							System.out.println("A história da Quinta");
						} else {
							if (opcao == 6) {
								System.out.println("A história da Sexta");
							} else {
								if (opcao == 7) {
									System.out.println("A história da Sábado");
								} else {
									System.out.println("Você não digitou um número da lista.");
								}
							}
						}
					}
				}
			}
		}
		ler.close();
	}

	public static String menu() {
		String aux = "Menu - História dos Dias da Semana \n- 1 - Domingo\n- 2 - Segunda\n- 3 - Terça\n- 4 - Quarta\n- 5 - Quinta\n- 6 - Sexta\n- 7 - Sábado";

		return aux;
	}

}
