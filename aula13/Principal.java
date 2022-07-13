package aula13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String op;
		Scanner ler = new Scanner(System.in);
		ContaCorrente cc = null;
		ContaPoupanca cp = null;

		do {

			exibirMenu();
			op = ler.nextLine();

			switch (op) {
			case "1": { // cadastro cc
				cc = new ContaCorrente();
				cc.cadastrar();

				break;
			}
			case "2": { // cadastro cp

				cp = new ContaPoupanca();
				cp.cadastrar();

				break;
			}
			// exibir dados conta corrente
			case "3": {
				if (cc == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					cc.exibirDados();
				}
				break;
			}
			// exibir dados conta poupança
			case "4": {
				if (cp == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					cp.exibirDados();
				}
				break;
			}

			// 5 e 6 - depositar

			case "5": {
				if (cc == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					System.out.println("Quanto deseja depositar? ");
					double aux = Double.parseDouble(ler.nextLine());
					cc.saldo = cc.saldo + aux;
					System.out.println(
							"Você depoistou o valor de R$ " + aux + " e seu saldo atual é de R$ " + cc.saldo + ".");
				}
				break;
			}

			case "6": {
				if (cp == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					System.out.println("Quanto deseja depositar? ");
					double aux = Double.parseDouble(ler.nextLine());
					cp.saldo = cp.saldo + aux;
					System.out.println("Você depoistou o valor de R$ " + aux + " e seu saldo atual é de R$ " + cp.saldo + ".");
				}
				break;
			}

			// 7 e 8 - sacar cc e cp
			case "7": {
				if (cc == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					System.out.println("Qual o valor que deseja sacar? ");
					double aux = Double.parseDouble(ler.nextLine());
					cc.saldo = cc.saldo - aux;
					System.out.println("Você Sacou R$" + aux + " e seu saldo da CC atual é " + cc.saldo + " .");
				}
				break;
			}

			case "8": {
				if (cp == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					System.out.println("Qual o valor que deseja sacar? ");
					double aux = Double.parseDouble(ler.nextLine());
					cp.saldo = cp.saldo - aux;
					System.out.println("Você Sacou R$" + aux + " e seu saldo da CP atual é " + cp.saldo + " .");
				}
				break;
			}

			// 9 e 10 - aumentar limite CC e aplicar RENDIMENTO

			case "9": {
				if (cc == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					System.out.println("Quanto deseja alterar seu limite? ");
					double aux = Double.parseDouble(ler.nextLine());
					cc.limite = cc.limite + aux;
					if (cc.limite < 0) {
						cc.limite = 0;
					}
					System.out.println("Você alterou em R$" + aux + " e seu limite da CC atual é " + cc.limite + " .");

				}
				break;
			}

			case "10": {
				if (cc == null) {
					System.out.println("Conta não cadastrada. Cadastre primeiro.");
				} else {
					System.out.println("Quanto deseja depositar? ");
					int aux = Integer.parseInt(ler.nextLine());
					cp.rendimento = cp.rendimento + aux;
					if (cp.rendimento < 0) {
						cp.rendimento = 0;
					}
					System.out.println(
							"Você alterou em R$" + aux + " e seu rendimento da CP atual é " + cp.rendimento + " .");

				}
				break;
			}

			// sair

			case "S":
			case "s": {

				System.out.println("Você escolheu sair do programa.");

				break;
			}

			default:
				break;

			}
		} while (!op.equalsIgnoreCase("s"));

		System.out.println("Fim do Programa");
		ler.close();

	}

	public static void exibirMenu() {
		// apenas exibir o menu
		System.out.println("");
		System.out.println("Menu Principal");
		System.out.println("Digite uma opção: ");
		System.out.println("1 - Cadastrar uma Conta Corrente");
		System.out.println("2 - Cadastrar uma Conta Poupança");
		System.out.println("3 - Exibir Dados Conta Corrente");
		System.out.println("4  - Exibir Dados Conta Poupança");
		System.out.println("5 - para DEPOSITAR em Conta Corrente");
		System.out.println("6 - para DEPOSITAR em Conta Poupança");
		System.out.println("7 - para SACAR em Conta Corrente");
		System.out.println("8 - para SACAR em Conta Poupança");
		System.out.println("9 - para AUMENTAR o valor do limite da Conta Corrente");
		System.out.println("10 - para APLICAR RENDIMENTO em Conta Poupança");
		System.out.println("S - para sair.");
		System.out.println("");

	}

}
