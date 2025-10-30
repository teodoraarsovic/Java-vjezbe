package vjezbe;
import java.util.ArrayList;   //samo za ArrayList varijantu
class Proizvod {
	private String opis;
	private String barkod;
	private String zemljaProizvodnje;
	private int godinaProizvodnje;
	private double uvoznaCijena;
	public Proizvod(String opis, String barkod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena) {
	    this.opis = opis;
	    this.barkod = barkod;
	    this.zemljaProizvodnje = zemljaProizvodnje;
	    this.godinaProizvodnje = godinaProizvodnje;
	    this.uvoznaCijena = uvoznaCijena;
	}

	public String getOpis() { return opis; }
	public double getUvoznaCijena() { return uvoznaCijena; }
	
	public double izracunajMaloprodajnuCijenu() {
		return uvoznaCijena;
	}
	
	public String osnovneInfo() {
		return "Opis: " + opis + " |Barkod: " + barkod + " | Zemlja: " + zemljaProizvodnje;
				
	public String toString() {
			return osnovneInfo();
		}
	}
	
	
	class Garderoba extends Proizvod {
		private String materijal;
		private String sezona;
		public Garderoba(String opis, String barkod, String zemljaPorijekla, int godinaProizvodnje, double uvoznaCijena) {
			super(opis,barkod,zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
			this.materijal = materijal;
			this.sezona = sezona;
		}
		public double izracunajMaloprodajnuCijenu() {
			return getUvoznaCijena() * 1.05;
		}
		public String toString() {
			return "[Garderoba] " + osnovneInfo() + " | Materijal: " + materijal + "| Sezona";
		}
	}
	
	public static void main(String[] args) {

		
		
	}

}
