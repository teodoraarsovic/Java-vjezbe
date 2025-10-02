package vježbe1;
import java.util.Scanner;


public class zadatak3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double P = sc.nextDouble();
		double r = Math.sqrt(Math.PI);
		double O = 2*r*Math.PI;
		System.out.printf("%.2f%/n", O);
		sc.close();

	}

}
