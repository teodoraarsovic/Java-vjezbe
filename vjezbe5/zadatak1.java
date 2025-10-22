package vjezbe5;
import java.util.Scanner;

public class zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.trim();
		
		String[] djelovi = line.split("\\s+");
		System.out.print(djelovi.length);

	}

}
