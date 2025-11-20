package zadatak1;

public class Automobili extends Vozilo {

	public Automobili(String id, double maxBrzina) {
        super(id, maxBrzina);
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / maxBrzina;
    }
}

