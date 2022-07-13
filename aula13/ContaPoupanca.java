package aula13;

import java.util.Scanner;

public class ContaPoupanca {
// declarando atributos da classe
	public String agencia;
	public String nrConta;
	public String titular;
	public double saldo;
	public int rendimento;

	public void cadastrar() {

		Scanner ler = new Scanner(System.in);
		System.out.println("CADASTRO DE CONTA CORRENTE");

		System.out.print("Digite o nome do Titular da Conta: ");
		titular = ler.nextLine();

		System.out.print("Digite o número da Agência: ");
		agencia = ler.nextLine();

		System.out.print("Digite o número da Conta: ");
		nrConta = ler.nextLine();

		System.out.print("Digite o Saldo da Conta: ");
		saldo = Double.parseDouble(ler.nextLine());

		System.out.print("Digite o Limite: ");
		rendimento = Integer.parseInt(ler.nextLine());

		System.out.println("Cadastro Realizado com Sucesso.");

	}

	public void exibirDados() {
		System.out.println("EXIBINDO OS DADOS DA CONTA POUPANÇA");
		System.out.println("Titular: " + titular);
		System.out.println("Agência: " + agencia);
		System.out.println("Número Conta: " + nrConta);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Rendimento: R$ " + rendimento);
	}

}
