package ifsul.tsi.poo;

public class Agencia {
	String endereco_agencia;
	String telefone_agencia;
	Conta[] contas_agencia = new Conta[10];
	Cliente[] clientes_agencia = new Cliente[10];
	int cont_clientes=0;
	
	public void cadastraCliente(Cliente cliente) {
		clientes_agencia[cont_clientes]=cliente;
		cont_clientes++;
	}
	
	public Conta criarConta(Cliente cliente, Agencia agencia, int numero) {
		Conta conta = new Conta(numero);
		conta.cliente_conta = cliente;
		conta.agencia_conta = agencia;
		return conta;
	}
	
	public float consultaSaldoConta(Conta conta) {
		return conta.getSaldo();
	}
	
	public void tranfereDinheiro(Conta transfere, float valor, Conta recebe) {
		float saldo1 = transfere.getSaldo();
		saldo1 -= valor;
		transfere.setSaldo(saldo1);
		
		float saldo2 = recebe.getSaldo();
		saldo2 -= valor;
		recebe.setSaldo(saldo2);
	}
}
