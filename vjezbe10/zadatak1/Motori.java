package zadatak1;

public class Motori extends Vozilo implements Ekonomican{
	
	public Motori(String id, double maxBrzina) {
        super(id, maxBrzina);
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / maxBrzina;
    }
    
    @Override
    public double potrosnjaPoKm() {
        return 0.05;
    }
}

