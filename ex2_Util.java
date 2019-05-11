package ifsul.tsi.poo;

public class Util {
	
	public static void somaArray(){
		int[] array1 = new int[10];
		int soma=0;
		for(int i=0;i<array1.length;i++){
			array1[i]=i+1;
			soma+=array1[i];
		}
		for(int i=0;i<array1.length;i++){
			System.out.println("array1["+i+"]="+array1[i]+"\n");
		}
		System.out.println("soma="+soma);
	}
	
	public static void ordenaArray(){
		int[] array2 = new int[10];
		
		array2[0]=5;
		array2[1]=3;
		array2[2]=9;
		array2[3]=1;
		array2[4]=4;
		array2[5]=2;
		array2[6]=8;
		array2[7]=7;
		array2[8]=6;
		array2[9]=10;
		
		for(int i=0;i<array2.length;i++){
			System.out.println("array2["+i+"]="+array2[i]+"\n");
		}
		
		int j=0;
		while(j<array2.length){
			for(int i=0;i<array2.length-1;i++){
				if(array2[i]>array2[i+1]){
					int aux=array2[i];
					array2[i]=array2[i+1];
					array2[i+1]=aux;
				}
			}
			j++;
		}
		
		System.out.println("\n");
		
		for(int i=0;i<array2.length;i++){
			System.out.println("array2["+i+"]="+array2[i]+"\n");
		}
	}
	
	public static void localizaValor(){
		int[] array3 = new int[10];
		int valor=6;
		
		array3[0]=5;
		array3[1]=3;
		array3[2]=9;
		array3[3]=1;
		array3[4]=4;
		array3[5]=2;
		array3[6]=8;
		array3[7]=7;
		array3[8]=6;
		array3[9]=10;
		
		for(int i=0;i<array3.length;i++){
			System.out.println("array3["+i+"]="+array3[i]+"\n");
		}
		
		for(int i=0;i<array3.length-1;i++){
			if(array3[i]==valor){
				System.out.println("Valor="+valor+" foi localizado no indice="+i);
			}
		}
	}
	
	public static void ehPalimdromo(){
		String str="reviver";
		int str_ult=str.length()-1;
		boolean teste=true;
		
		if(str.length()%2==0) {
			for(int i=0;i<(str.length())/2;i++){
				if(str.charAt(i)==str.charAt(str_ult)) {
					str_ult--;
					continue;
				}
				else {
					System.out.println(str+" não é palimdromo!");
					teste=false;
					break;
				}
			}
		}
		else {
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==str.charAt(str_ult)) {
					str_ult--;
					continue;
				}
				else {
					System.out.println(str+" não é palimdromo!");
					teste=false;
					break;
				}
			}
		}
		if(teste==true) {
			System.out.println(str+" é palimdromo!");
		}
	}
	
	public static void vogalConsuante(){
		String[] array4 = new String[4];
		String[] arraycopy = new String[4];
		
		array4[0]="objetos";
		array4[1]="a";
		array4[2]="orientada";
		array4[3]="programação";
		
		for(int i=0;i<array4.length;i++) {
			arraycopy[i]=array4[i];
		}
		int j=(array4.length)-1;
		for(int i=0;i<array4.length;i++) {
			array4[i]=arraycopy[j];
			j--;
		}
		
		System.out.println(array4[0]+" "+array4[1]+" "+array4[2]+" "+array4[3]);
		
		int cont_vogal=0, cont_consu=0;
		for(int x=0;x<array4.length;x++) {
			for(int k=0;k<array4[x].length();k++) {
				if(array4[x].charAt(k)=='a'||array4[x].charAt(k)=='e'||array4[x].charAt(k)=='i'
					||array4[x].charAt(k)=='o'||array4[x].charAt(k)=='u'||array4[x].charAt(k)=='A'
					||array4[x].charAt(k)=='E'||array4[x].charAt(k)=='I'||array4[x].charAt(k)=='O'
					||array4[x].charAt(k)=='U') {
					cont_vogal++;
					
				}
				else {
					cont_consu++;
				}
			}
		}
		System.out.println("Vogais="+cont_vogal);
		System.out.println("Consuantes="+cont_consu);
	}
}
