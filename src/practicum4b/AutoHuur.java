package practicum4b;

import practicum4a.Persoon;

public class AutoHuur {
    private int aantalDagen;

    private Auto auto;
    private Klant klant;

    public AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.auto = gA;
    }

    public Auto getGehuurdeAuto() {
        return auto;
    }

    public void setHuurder(Klant k) {
        this.klant = k;
    }

    public Klant getHuurder() {
        return klant;
    }

    public double totaalPrijs() {
        if (auto == null || klant == null) {
            return 0.0;
        }
        double prijs = auto.getPrijsPerDag() * aantalDagen;
        double korting = (prijs * klant.getKorting()) / 100;
        return prijs - korting;
    }

    @Override
    public String toString() {
        String autoInfo = (auto != null) ? auto.toString() + "\n" : "er is geen auto bekend\n";
        String huurderInfo = (klant != null) ? "op naam van: " + klant + "\n" : "er is geen huurder bekend\n";
        return autoInfo + huurderInfo + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}

