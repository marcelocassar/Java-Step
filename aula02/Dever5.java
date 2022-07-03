package aula02;

import java.util.Scanner;

public class Dever5 {

	public static void main(String[] args) {

//		Faça um programa em Java para armazenar o nome, sobrenome, o nome do meio, 
//		o ano de nascimento, o ano atual, o sexo(M/F), a cidade, o estado 
//		e o tipo sanguíneo. 
//		Exiba na tela a seguinte frase:
//		<nome> <nome do meio> <sobrenome> do sexo <sexo>, morador da <cidade> - 
//		<estado>, nasceu no ano <ano> e tem <idade> anos. 
//		Seu tipo sanguíneo é <sanguíneo>.

		Scanner ler = new Scanner(System.in);
			
		String nome, segundonome, sexo, cidade, sangue; 
		int anonasc, anoatual;
			
		
		System.out.println("Digite seu primeiro nome: ");		
		nome = ler.next(); 
		
		System.out.println("Digite seu segundo nome: ");
		segundonome = ler.next();
	
		
		System.out.println("Digite seu ano de nascimento: ");
		anonasc = ler.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoatual = ler.nextInt();
		
		System.out.println("Digite seu sexo: M ou F.");
		sexo = ler.next();
		
		System.out.println("Digite a Cidade: ");
		cidade = ler.next();
		
		System.out.println("Digite o tipo sanguíneo");
		sangue = ler.next();
		
		System.out.println(nome + "," + segundonome  + "," + " ano de nascimento: " + anonasc + "," + sangue + "," + cidade  + "," + sexo + "," + (anoatual - anonasc) + ".");
		
		ler.close();
	}

}
