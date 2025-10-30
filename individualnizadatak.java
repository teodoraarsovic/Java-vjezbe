package vjezbe;

class Vozilo {
	private String prizvodjac;
	private int godinaProizvodnje;
	private double kubikaza;
	private String boja;
	public Vozilo(String prizvodjac, int godinaProizvodnje, double kubikaza, String boja) {
		this.prizvodjac = prizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
		
	}	
	public double izracunajCijenuRegistracije() {
		double cijena = 100;
		
		if (godinaProizvodnje < 2010)
			cijena += 30;
		if (kubikaza >2000)
			cijena += 50;
		return cijena;
		
	}
	public String getPrizvodjac() {
		return prizvodjac;
	}
	public void setPrizvodjac(String prizvodjac) {
		this.prizvodjac = prizvodjac;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public double getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(double kubikaza) {
		this.kubikaza = kubikaza;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	public String toString() {
		return "Vozilo [prizvodjac=" + prizvodjac + ", godinaProizvodnje=" + godinaProizvodnje + ", kubikaza="
				+ kubikaza + ", boja=" + boja + "]";
	}
	
	
	class Automobil extends Vozilo {
		private int brojVrata;
		private String tipMotora;
		public Automobil(String prizvodjac, int godinaProizvodnje, double kubikaza, String boja, int brojVrata,
				String tipMotora) {
			super(prizvodjac, godinaProizvodnje, kubikaza, boja);
			this.brojVrata = brojVrata;
			this.tipMotora = tipMotora;
		}
		public double izracunajCijenuRegistracije() {
			double cijena = super.izracunajCijenuRegistracije();
		    cijena =+ 20;
			return cijena;
		}
		public int getBrojVrata() {
			return brojVrata;
		}
		public void setBrojVrata(int brojVrata) {
			this.brojVrata = brojVrata;
		}
		public String getTipMotora() {
			return tipMotora;
		}
		public void setTipMotora(String tipMotora) {
			this.tipMotora = tipMotora;
		}
		public String toString() {
			return "Automobil [brojVrata=" + brojVrata + ", tipMotora=" + tipMotora + "]";
		}
		
	}
	
	
	class Kamion extends Vozilo {
		private int KapacitetTereta;
		private boolean prikolica;
		public Kamion(String prizvodjac, int godinaProizvodnje, double kubikaza, String boja, int kapacitetTereta,
				boolean prikolica) {
			super(prizvodjac, godinaProizvodnje, kubikaza, boja);
			KapacitetTereta = kapacitetTereta;
			this.prikolica = prikolica;
		}	
		public double izracunajCijenuRegistracije() {
		double cijena = super.izracunajCijenuRegistracije();
			if (prikolica == true);
			cijena =+ 50;
			return cijena;
		}
		public int getKapacitetTereta() {
			return KapacitetTereta;
		}
		public void setKapacitetTereta(int kapacitetTereta) {
			KapacitetTereta = kapacitetTereta;
		}
		public boolean isPrikolica() {
			return prikolica;
		}
		public void setPrikolica(boolean prikolica) {
			this.prikolica = prikolica;
		}
		public String toString() {
			return "Kamion [KapacitetTereta=" + KapacitetTereta + ", prikolica=" + prikolica + "]";
		}
		
	}
	
	
	class Kombi extends Vozilo {
		private int kapacitetPutnika;

		public Kombi(String prizvodjac, int godinaProizvodnje, double kubikaza, String boja, int kapacitetPutnika) {
			super(prizvodjac, godinaProizvodnje, kubikaza, boja);
			this.kapacitetPutnika = kapacitetPutnika;
		}	
		public double izracunajCijenuRegistracije() {
		double cijena = super.izracunajCijenuRegistracije();
				if (kapacitetPutnika > 8);
				cijena =+ 30;
				return cijena;
		
		}

		public int getKapacitetPutnika() {
			return kapacitetPutnika;
		}

		public void setKapacitetPutnika(int kapacitetPutnika) {
			this.kapacitetPutnika = kapacitetPutnika;
		}

		public String toString() {
			return "Kombi [kapacitetPutnika=" + kapacitetPutnika + "]";
		}
		
	}
	
	
	
	public class Test {
	public static void main(String[] args) {
	Vozilo v1 = new Vozilo ("Audi", 2015, 1800, "Crna");
	
	
	
}
		

	}

}
