package vježbe1;
import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble(), x2 = sc.nextDouble(), y1=sc.nextDouble(), y2=sc.nextDouble() ;
				
		double a = Math.abs(x1-x2) ;
		double b = Math.abs(y1-y2) ;
		
		
		double P = a*b;
		double O = 2*a+2*b;
		
		System.out.printf("Površina je:%.2f%n",P,O);

	}

}
