package aula12;

public class ContaPoupanca {
// declarando atributos da classe
	public String agencia;
	public String nrConta;
	public String titular;
	public double saldo;
	public int rendimento;

	/* public void cadastrar(String ag, String nr, String titu, double sald, int rend) {

		// String ag, String nr, String ti, double sald, int rend
		// o principal faz a alteração;

		agencia = ag;
		nrConta = nr;
		titular = titu;
		saldo = sald;
		rendimento = rend;

	}
	*/
	
	public void cadastrar(String agencia, String nrConta, String titular, double saldo, int rendimento) {
		
		this.agencia = agencia;
		this.nrConta = nrConta;
		this.titular = titular;
		this.saldo = saldo;
		this.rendimento = rendimento;
		
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
