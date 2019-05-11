package lista6;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> array1 = new ArrayList<String>(6);
		
		array1 = ListaArray.criaListaDeCores();
		ListaArray.imprimeArray(array1);
		
		System.out.println();//-----------------------------------------------------------------------
		
		array1 = ListaArray.juntaCores(array1);
		ListaArray.imprimeArray(array1);
		
		System.out.println();//-----------------------------------------------------------------------
		
		array1 = ListaArray.novaPrimeiraCor(array1, "Marrom");
		ListaArray.imprimeArray(array1);
		
		System.out.println();//-----------------------------------------------------------------------
		
		array1 = ListaArray.removeCorPorInicial(array1, 'A');
		ListaArray.imprimeArray(array1);
		
		System.out.println();//-----------------------------------------------------------------------
		
		ArrayList<String> array2 = new ArrayList<String>();
		array2 = ListaArray.criaListaDeCores();
		
		array1 = ListaArray.criaListaDeCores();
		
		array1 = ListaArray.ordenaListas(array1, array2);
		
		ListaArray.imprimeArray(array1);
		
		System.out.println();//-----------------------------------------------------------------------
		
		array2 = ListaArray.criaListaDeCores();
		array1 = ListaArray.criaListaDeCores();
		
		array1 = ListaArray.interpolaListas(array1, array2);
		
		ListaArray.imprimeArray(array1);
		
		System.out.println();//-----------------------------------------------------------------------
		
		array2 = ListaArray.criaListaDeCores();
		array1 = ListaArray.criaListaDeCores();
		
		boolean teste = ListaArray.listasIguais(array1, array2);
		System.out.println(teste);
		
		System.out.println();//-----------------------------------------------------------------------

		array2 = ListaArray.criaListaDeCores();
		array1 = ListaArray.criaListaDeCores();
		
		int qtd = ListaArray.qtdElementosUnicos(array1, array2);
		System.out.println(qtd);
		
		System.out.println();//-----------------------------------------------------------------------
		
		ArrayList<Integer> arrayInteger = new ArrayList<Integer>(5);
		arrayInteger.add(1);
		arrayInteger.add(2);
		arrayInteger.add(3);
		arrayInteger.add(4);
		arrayInteger.add(5);
		
		System.out.println(arrayInteger);
		arrayInteger = ListaArray.removePares(arrayInteger);
		System.out.println(arrayInteger);
		
		System.out.println();//-----------------------------------------------------------------------
		
		array2 = ListaArray.criaListaDeCores();
		array1 = ListaArray.criaListaDeCores();
		
		boolean teste2 = ListaArray.contemLista(array1, array2);
		System.out.println(teste2);
		
	}

}
