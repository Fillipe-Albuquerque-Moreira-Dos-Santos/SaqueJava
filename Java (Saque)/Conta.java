package aula;

import java.util.Scanner;

public class Conta {

	private double balanco;

	public Conta(double balancoInicial) {
		if (balancoInicial > 0.0) {
			balanco = balancoInicial;
		}
	}

	public void Deposito(double acrescimo) {
		balanco = balanco + acrescimo;
	}

	public double getbalanco() {
		return balanco;
	}

	public void Sacar(double valor) {
		if (valor > balanco) {
			System.out.println("Saldo insuficiente!");
			System.out.println("-------------------");
		} else {
			balanco -= valor;
			System.out.println("Saque realizado com sucesso!"); 
			System.out.println("----------------------------");
			System.out.println("o  Valor sacado foi : R$" + valor);
	    }
		}
	

	public static void main(String args[]) {

		Conta conta1 = new Conta(50.00);
		Conta conta2 = new Conta(-7.53);
		System.out.println("Saldo da conta 1 : " + conta1.getbalanco());
		System.out.println("-----------------------------------------");
		System.out.println("Saldo da conta 2 : " + conta2.getbalanco());

		Scanner sc = new Scanner(System.in);

		double deposito;

		System.out.println("Digite o deposito para a conta 1: ");
		System.out.println("-----------------------------------------");
		deposito = sc.nextDouble();

		conta1.Deposito(deposito);

		System.out.println("--------------------------------------------");
		System.out.println("O valor da conta 1 é: " + conta1.getbalanco());
		System.out.println("--------------------------------------------");
		System.out.println("O valor da conta 2 é: " + conta2.getbalanco());
		System.out.println("--------------------------------------------");

		System.out.println("Digite o deposito para a conta 2: ");
		deposito = sc.nextDouble();

		conta2.Deposito(deposito);

		System.out.println("O valor da conta 1 é: " + conta1.getbalanco());
		System.out.println("--------------------------------------------");
		System.out.println("O valor da conta 2 é: " + conta2.getbalanco());
		
		double valorSaque;

		System.out.println("----------------------------------------");
		System.out.println("Digite o valor do saque para a conta 1: ");
		System.out.println("-----------------------------------------");
		 valorSaque= sc.nextDouble();
		
		conta1.Sacar(valorSaque);
		
		System.out.println("--------------------------------------------");
		System.out.println("Novo saldo da conta 1: " + conta1.getbalanco());
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("Digite o valor do saque para a conta 2: ");
		System.out.println("--------------------------------------------");
		valorSaque = sc.nextDouble();
		
		conta2.Sacar(valorSaque);
		System.out.println("--------------------------------------------");
		System.out.println("Novo saldo da conta 2: " + conta2.getbalanco());
		System.out.println("--------------------------------------------");

	}

}
