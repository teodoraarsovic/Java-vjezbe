package vjezbe3;

import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int velicinaNiza= sc.nextInt();
		int[] bodovi = new int[velicinaNiza];
		for(int i = 0;i < bodovi.length; i++) {
			System.out.println("Unesite" + (i + 1) + ". element niza:" );
			bodovi[i] = sc.nextInt();	
		}

		double prosjek = 0;
		
		for(int x:bodovi) {
			prosjek += x;
		}
		System.out.println("Prosjek je: " + prosjek/velicinaNiza);
		
		int min = 100;
		for(int x:bodovi) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("Minimum je: " +min);
	}

}
