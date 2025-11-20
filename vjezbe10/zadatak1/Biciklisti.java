package zadatak1;

public class Biciklisti extends Vozilo implements Ekonomican {
	
	public Biciklisti(String id, double maxBrzina) {
        super(id, maxBrzina);
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / maxBrzina;
    }

    @Override
    public double potrosnjaPoKm() {
        return 0.0; 
    }
}

