package ifsul.tsi.poo.lista5;

public class Pessoa {
	String nome;
	String sobrenome;
	int matricula;
	String cpf;
	String rg;
	int idade;
	String senha;
	
	public Pessoa(){
		
	}
	public Pessoa(String nome, String sobrenome){
			
	}
	public Pessoa(String cpf){
		
	}
	public boolean logaPessoa(int matricula, String senha) {
		if(this.matricula==matricula && this.senha==senha)
			return true;
		return false;
	}
	public boolean logaPessoa(String cpf, String senha) {
		if(this.cpf==cpf && this.senha==senha)
			return true;
		return false;
	}
}
