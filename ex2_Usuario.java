package ifsul.tsi.poo;
import java.util.Scanner;

public class Usuario {
	String nome;
	String email;
	String senha;
	Livro[] livrosLocados;
	
	public static Usuario lerDadosUsuario(){
		Usuario usu = new Usuario();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do Usuario:");
		usu.nome = scan.nextLine();
		System.out.println("Digite o email do Usuario:");
		usu.email = scan.nextLine();
		System.out.println("Digite a senha do Usuario:");
		usu.senha = scan.nextLine();
		usu.livrosLocados = new Livro[100];
		
		scan.close();
		
		return usu;
	}
	
	public static boolean logar(Usuario usu, String senha) {
		if(senha==usu.senha)
			return true;
		return false;
	}
	
	public static boolean retirarLivro(Usuario usu, Livro liv) {
		if(liv.estado=="locado")
			return false;
		liv.estado="locado";
		usu.livrosLocados[0]=liv;
		return true;
	}
	
	public static boolean devolverLivro(Usuario usu, Livro liv) {
		if(liv.estado=="locado") {
			liv.estado="disponivel";
			return true;
		}
		usu.livrosLocados[0]=null;
		return true;
	}
	public Usuario() {
	}
	public Usuario(String nome) {
		this.nome=nome;
	}
	public Usuario(String nome, String email) {
		this.nome=nome;
		this.email=email;
	}
	public Usuario(String nome, String email, String senha) {
		this.nome=nome;
		this.email=email;
		this.senha=senha;
	}
}
