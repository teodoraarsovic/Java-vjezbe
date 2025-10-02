package vježbe1;
import java.util.Scanner;

public class zadatak6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite xHrasta: ");
		double xH = sc.nextDouble(); //hrast
		System.out.print("Unesite xKuce: ");
		double xK = sc.nextDouble(); //kuca
		System.out.print("Unesite yHrasta: ");
		double yH = sc.nextDouble(); //hrast
		System.out.print("Unesite yKuce: ");
		double yK = sc.nextDouble(); //kuca
		double xB = xK+2;
		double yB = yK-3;
		
		double HB=Math.sqrt(Math.pow((yB-yH), 2)+Math.pow((xB-xH), 2));
		
		System.out.printf("Udaljenost od hrasta do blaga je %.2f", HB);

			}

}
