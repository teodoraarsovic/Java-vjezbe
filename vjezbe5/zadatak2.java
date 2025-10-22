package vjezbe5;
import java.util.Scanner;

public class zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite rijec za koju zelite provjeriti da li je palindrom");
		
		String x = sc.nextLine().trim();
		String y = new StringBuilder(x).reverse().toString();
		
		if (x.equalsIgnoreCase(y)) {
			System.out.println("Jeste palindrom");
		}
		else {
			System.out.println("Nije palindrom");
		}

	}

}
