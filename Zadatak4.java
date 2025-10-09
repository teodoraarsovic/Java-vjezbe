package vjezbe3;
import java.util.Scanner;
public class Zadatak4 {
	private double[] temperature;
	
	public Zadatak4(double[]temperature) {
		this.temperature = temperature;
	}
	
	public double[] getTemperature() {
		return temperature;
		}
	public void setTemperature(double[] temperature) {
		this.temperature = temperature;
		}
	public double prosjecnaTemperatura() {
        double suma = 0;
        for (double t : temperature) {
            suma += t;
        }
        return suma / temperature.length;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi dužinu niza: ");
		int velicinaNiza = sc.nextInt();
		double[]temperature = new double[velicinaNiza];
		
		for (int i = 0; i < velicinaNiza; i++) {
            System.out.print("Unesi temperaturu za dan " + (i + 1) + ": ");
            temperature[i] = sc.nextDouble();

	}
		Zadatak4 zadatak = new Zadatak4(temperature);
        double prosjek = zadatak.prosjecnaTemperatura();
        System.out.printf("Prosječna temperatura je: %.2f°C\n", prosjek);
        sc.close();
	}

}
