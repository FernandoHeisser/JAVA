package ifsul.tsi.poo;

public class Conta {
	Cliente cliente_conta;
	Agencia agencia_conta;
	final int numero_conta;
	private float saldo_conta;
	
	public float getSaldo() {
		return saldo_conta;
	}
	public void setSaldo(float valor) {
		saldo_conta = valor;
	}
	
	public void forneceSaldo(float valor) {
		saldo_conta += valor;
	}
	
	public void recebeTransferencia(Conta retirada, float valor) {
		retirada.saldo_conta -= valor;
		saldo_conta += valor;
	}
	
	public void recebeDinheiro(float valor) {
		saldo_conta += valor;
	}
	
	public Conta(int numero) {
		numero_conta=numero;
	}
	
}
