package javavjezbe11;

import javax.swing.JOptionPane;

public class Grafika2 {

    public static void main(String[] args) {
        String ime = JOptionPane.showInputDialog("Unesite ime: ");
        String prezime = JOptionPane.showInputDialog("Unesite prezime: ");
        String godiste = JOptionPane.showInputDialog(null, "Unesite godiste: ");

        int godinaRodjenja = Integer.parseInt(godiste);

        String confirmationMessage = "Pregled podataka:\n\n" +
                "Ime: " + ime + "\n" +
                "Prezime: " + prezime + "\n" +
                "Godina rodjenja: " + godinaRodjenja + "\n\n" +
                "Da li su uneseni podaci tacni?";

        int dugme = JOptionPane.showConfirmDialog(
                null,
                confirmationMessage,
                "Pregled i potvrda unosa",
                JOptionPane.YES_NO_OPTION
        );

        if (dugme == JOptionPane.YES_OPTION) {
            String email = ime + "." + prezime + godinaRodjenja + "@kompanija.me";

            JOptionPane.showMessageDialog(
                    null,
                    "Vasa email adresa je: " + email,
                    "Email",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Podaci nijesu potvrdjeni. Pokrenite program ponovo za novi unos.",
                    "Nepotvrdjeni podaci",
                    JOptionPane.WARNING_MESSAGE);
        }

     
    }
}
