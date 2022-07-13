package aula12;

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

				System.out.println("CADASTRO DE CONTA POUPANÇA");
				System.out.print("Digite o nome do titular da conta: ");
				String titular = ler.nextLine();

				System.out.print("Digite a Agência: ");
				String agencia = ler.nextLine();

				System.out.print("Digite o número da conta: ");
				String nrConta = ler.nextLine();

				System.out.print("Digite o saldo da conta: ");
				double saldo = Double.parseDouble(ler.nextLine());

				System.out.println("Digite o rendimento da conta: ");
				int rendimento = Integer.parseInt(ler.nextLine());

				cp = new ContaPoupanca();
				cp.cadastrar(agencia, nrConta, titular, saldo, rendimento);
				// cp.exibirDados();
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

			case "S":
			case "s": { // sair

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

		System.out.println("Menu Principal");
		System.out.println("Digite uma opção: ");
		System.out.println("1 - Cadastrar uma Conta Corrente");
		System.out.println("2 - Cadastrar uma Conta Poupança");
		System.out.println("3 - Exibir Dados Conta Corrente");
		System.out.println("4  - Exibir Dados Conta Poupança");
		System.out.println("S - para sair.");

	}

}
