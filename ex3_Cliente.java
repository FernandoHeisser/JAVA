package ifsul.tsi.poo;

public class Cliente {
	String nome_cliente;
	String endereco_cliente;
	String cpf_cliente;
	Conta conta_cliente;
	
	public void sacarDinheiro(float valor) {
		float saldo=conta_cliente.getSaldo();
		saldo -= valor;
		conta_cliente.setSaldo(saldo);
	}
	
	public void depositarDinheiro(float valor) {
		float saldo=conta_cliente.getSaldo();
		saldo -= valor;
		conta_cliente.setSaldo(saldo);
	}
	
	public void tranfereDinheiro(float valor, Conta recebe) {
		float saldo=conta_cliente.getSaldo();
		saldo -= valor;
		conta_cliente.setSaldo(saldo);
		float saldo2=recebe.getSaldo();
		saldo2 += valor;
		recebe.setSaldo(saldo2);
	}
	
	public void verificaSaldo() {
		System.out.println(conta_cliente.getSaldo());
	}
}
