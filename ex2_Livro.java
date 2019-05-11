package ifsul.tsi.poo;
import java.util.Scanner;

public class Livro {
	String titulo;
	String autor;
	int ano;
	int n_paginas;
	int id;
	int idAtual;
	String estado;
	
	public static Livro lerDadosLivro() {
		Livro liv = new Livro();
		Scanner scan = new Scanner(System.in);
		
		liv.titulo = scan.nextLine();
		liv.autor = scan.nextLine();
		liv.ano = scan.nextInt();
		liv.n_paginas = scan.nextInt();
		liv.id = scan.nextInt();
		liv.idAtual = scan.nextInt();
		liv.estado = scan.nextLine();
		
		scan.close();
		
		return liv;
	}
	
	public Livro() {
	}
	public Livro(String titulo) {
		this.titulo=titulo;
	}
	public Livro(String titulo, String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}
	public Livro(String titulo, String autor, int ano) {
		this.titulo=titulo;
		this.autor=autor;
		this.ano=ano;
	}
	public Livro(String titulo, String autor, int ano, int id) {
		this.titulo=titulo;
		this.autor=autor;
		this.ano=ano;
		this.id=id;
	}
	public Livro(String titulo, String autor, int ano, int id, int idAtual) {
		this.titulo=titulo;
		this.autor=autor;
		this.ano=ano;
		this.id=id;
		this.idAtual=idAtual;
	}
	public Livro(String titulo, String autor, int ano, int n_paginas, int id, int idAtual) {
		this.titulo=titulo;
		this.autor=autor;
		this.ano=ano;
		this.id=id;
		this.idAtual=idAtual;
		this.n_paginas=n_paginas;
	}
	public Livro(String titulo, String autor, int ano, int n_paginas, int id, int idAtual, String estado) {
		this.titulo=titulo;
		this.autor=autor;
		this.ano=ano;
		this.id=id;
		this.idAtual=idAtual;
		this.n_paginas=n_paginas;
		this.estado=estado;
	}
}
