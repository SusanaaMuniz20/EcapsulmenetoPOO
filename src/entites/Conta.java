package entites;

public class Conta {

	private String titular;
	private String agencia;
	private int numeroconta;
	private double saldo;
	
	
	//get == obter
	public String getTitular () {
		return titular;
	}
	// set == atribui valor
	// this == identifica o aributo da classe
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//atalho -> alt + shift + s
	
	
	public void depositar(double valordeposito) {
		saldo += valordeposito;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void saque(double valorSaque) {
		saldo -= valorSaque;
	}
	
	public void obterDadosbancario() {
		System.out.println("Titutlar: " + titular);
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + numeroconta);
		System.out.println("Saldo: " + saldo);
	}
	
	
	
}
