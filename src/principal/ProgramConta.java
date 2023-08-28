package principal;

import entites.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new Conta ();
		
		conta.setTitular ("Susana");
		//System.out.println("nome do titular: " + conta.getTitular());
		
		conta.setAgencia ("2535-x");
		conta.setNumeroConta (6650);
		conta.saldo = 15000.00;
		
		
		conta.depositar(30000.00);
		
		conta.obterDadosbancario();
		
		conta.saque(22500.00);
		
		conta.obterDadosbancario();
		
		
		
	}

}
