package View;

import Interno.Cliente;
import Interno.Conta;
import Interno.ContaCorrente;
import Interno.ContaPoupanca;
import Interno.TesouroDireto;

public class Principal {
	public static void main(String[] args) {
		// Criação do cliente, sem a Conta;
		
		System.out.println("CADASTRO DE CLIENTES\n");

		Cliente bruno = new Cliente("Bruno","07254039349","20263709562",20);
		System.out.println("Bruno: " + bruno.toString() + "\n");

		Cliente roberta = new Cliente("Roberta","04682675350","20046598351",50);
		System.out.println("Roberta: " + roberta.toString() + "\n");

		Cliente maria = new Cliente ("Maria","07976434572","3408564853",16);
		System.out.println("Maria: " + maria.toString() + "\n");
		
		Cliente joao = new Cliente ("João","02465345720","3345964853",25);
		System.out.println("Joao: " + joao.toString() + "\n");

		// Criação das Conta 
		
		Conta ceara = new ContaPoupanca("Ceara", bruno, "CE", 300);
		
		Conta fortaleza = new TesouroDireto("Fortaleza", roberta, "FT", 300);
		
		Conta natal = new ContaCorrente("Natal", maria, "NT");
		
		Conta rio = new ContaCorrente("Rio", joao, "RJ");
		
		System.out.println(ceara);
		System.out.println(fortaleza + "\n");
		System.out.println(natal);
		System.out.println(rio);
		
		// O trasferir ele ja chama o metodo sacar e depositar;
	
		ceara.transferir(fortaleza, 200);
		rio.depositar(1200);
		rio.sacar(500);
		
		System.out.println(ceara);
		System.out.println(fortaleza);
		System.out.println(rio);
	}
}