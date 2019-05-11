package ifsul.tsi.poo;

public class Main {

	public static void main(String[] args) {
		
		Agencia agencia001 = new Agencia();
		
		Cliente cliente001 = new Cliente();
		cliente001.nome_cliente="Fulano";
		cliente001.endereco_cliente="Rua Tal";
		cliente001.cpf_cliente="930.487.124-65";
		
		agencia001.cadastraCliente(cliente001);
		
		System.out.println(agencia001.clientes_agencia[0].nome_cliente);
	}

}
