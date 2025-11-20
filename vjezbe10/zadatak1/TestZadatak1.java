package zadatak1;
import java.util.ArrayList;

public class TestZadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 ArrayList<Vozilo> vozila = new ArrayList<>();

	        vozila.add(new Biciklisti("B1", 20));
	        vozila.add(new Motori("M1", 60));
	        vozila.add(new Automobili("A1", 80));

	        double udaljenost = 10;

	        System.out.println("Dostava za " + udaljenost + " km ");

	        for (Vozilo v : vozila) {

	            v.info();
	            double vrijeme = v.izracunajVrijemeDostave(udaljenost);
	            System.out.println("Vrijeme dostave: " + vrijeme + " h");

	            if (v instanceof Ekonomican) {
	                Ekonomican e = (Ekonomican) v;
	                double potrosnja = e.potrosnjaPoKm() * udaljenost;
	                System.out.println("Potrosnja na " + udaljenost + " km: " + potrosnja);
	            }

	            System.out.println();
	        }

	        for (Vozilo v : vozila) {
	            double vrijeme = v.izracunajVrijemeDostave(udaljenost);
	            System.out.print(v.id  + vrijeme);

	            if (v instanceof Ekonomican) {
	                Ekonomican e = (Ekonomican) v;
	                System.out.print(", potrošnja: " + (e.potrosnjaPoKm() * udaljenost));
	            }

	            System.out.println();
	        }
	    


	}

}
