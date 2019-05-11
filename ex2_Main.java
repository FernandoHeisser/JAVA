package ifsul.tsi.poo;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca bib = new Biblioteca();
		Usuario usu = new Usuario();
		
		bib.nome="Biblioteca Municipal";
		bib.cidade="Charqueadas";
		bib.usuarios=new Usuario[100];
		bib.livros=new Livro[100];
		
		usu.nome="Fulano";
		usu.email="fulano@gmail.com";
		usu.senha="123";
		usu.livrosLocados=new Livro[3];
		
		Biblioteca.cadastrarUsuario(bib, usu);
		
		System.out.println(bib.usuarios[0].nome);
	}
}
