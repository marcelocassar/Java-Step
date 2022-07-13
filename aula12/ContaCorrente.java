package aula12;

import java.util.Scanner;

public class ContaCorrente {
// declarando atributos da classe
	public String agencia;
	public String nrConta;
	public String titular;
	public double saldo;
	public double limite;

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
		limite = Double.parseDouble(ler.nextLine());

		System.out.println("Cadastro Realizado com Sucesso.");

		// exibirDados();

		// Scanner só ler string, e não pode fechar o scanner.
		// Somente fecha no final do principal. Isso é um bug.
	}

	public void exibirDados() {

		System.out.println("EXIBINDO OS DADOS DA CONTA CORRENTE");
		System.out.println("Titular: " + titular);
		System.out.println("Agência: " + agencia);
		System.out.println("Número Conta: " + nrConta);
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Limite: R$ " + limite);
		System.out.println("Saldo Total: R$ " + (saldo + limite));

	}

}
