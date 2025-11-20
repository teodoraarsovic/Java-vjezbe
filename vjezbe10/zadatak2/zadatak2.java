package zadatak2;
import java.util.Scanner;
import java.util.InputMismatchException;

public class zadatak2 {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        double cijena = 0;
	        boolean validno = false;

	        while (!validno) {
	            System.out.print("Unesite cijenu proizvoda: ");

	            try {
	                cijena = scanner.nextDouble();   //

	                if (cijena <= 0) {
	                    throw new IllegalArgumentException("Cijena mora biti veća od nule.");
	                }

	                validno = true;

	            } catch (InputMismatchException e) {
	                System.out.println("Greška: morate unijeti broj, a ne tekst.");
	                scanner.nextLine();
	            } catch (IllegalArgumentException e) {
	                System.out.println("Greška: " + e.getMessage());
	            }
	        }

	        System.out.println("Uspješno unesena cijena: " + cijena);
	    }
	}
