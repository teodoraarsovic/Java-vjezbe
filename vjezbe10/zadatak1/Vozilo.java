package zadatak1;

public abstract class Vozilo {

    protected String id;
    protected double maxBrzina;

    public Vozilo(String id, double maxBrzina) {
        this.id = id;
        this.maxBrzina = maxBrzina;
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Maksimalna brzina: " + maxBrzina + " km/h");
    }

    public abstract double izracunajVrijemeDostave(double udaljenostKm);
}
