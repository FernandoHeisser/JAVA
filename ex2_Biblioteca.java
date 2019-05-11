package ifsul.tsi.poo;
import java.util.Scanner;

public class Biblioteca {
	String nome;
	Livro[] livros;
	String cidade;
    Usuario[] usuarios;
    
    static int cont_livros=0;
    static int cont_usuarios=0;
	
	public static Biblioteca lerDadosBiblioteca(){
		Biblioteca bib = new Biblioteca();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da Bibilioteca:");
		bib.nome = scan.nextLine();
		bib.livros = new Livro[100]; 
		bib.usuarios = new Usuario[100];
		System.out.println("Digite a cidade da Bibilioteca:");
		bib.cidade = scan.nextLine();
		
		scan.close();
		
		return bib;
	}
	
	public static void cadastrarUsuario(Biblioteca bib, Usuario usu) {
		bib.usuarios[cont_usuarios] = usu;
		cont_usuarios++;
	}
	
	public static void cadastrarLivro(Biblioteca bib, Livro liv) {
		bib.livros[cont_livros] = liv;
		cont_livros++;
	}
	
	public Biblioteca() {	
	}
	public Biblioteca(String nome) {
		this.nome=nome;
	}
	public Biblioteca(String nome, String cidade) {
		this.nome=nome;
		this.cidade=cidade;
	}
}
