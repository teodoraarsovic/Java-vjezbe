package vjezbe3;

import java.util.Scanner;
public class Zadatak3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int velicinaNiza= sc.nextInt();
		int[] brojevi = new int[velicinaNiza];
		for(int i = 0;i < brojevi.length; i++) {
			System.out.println("Unesite" + (i + 1) + ". element niza:" );
			brojevi[i] = sc.nextInt();	
		}
		for (int i =0; i < brojevi.length - 1;i++) {
			for(int j=0; j < brojevi.length - 1; j++) {
			    if(brojevi[j] > brojevi[j+1]) {
			    	int tmp = brojevi[j];
			    	brojevi[j] = brojevi[j+1];
			    	brojevi[j+1] = tmp;
			    }
			}
			
		}
		for(int x:brojevi) {
			System.out.println(x);
		}
	}

}
