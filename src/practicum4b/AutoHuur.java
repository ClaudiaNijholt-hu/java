package practicum4b;

public class AutoHuur {
    private Auto gehuurdeAuto;
    private Klant huurder;
    private int aantalDagen;

    public AutoHuur() {
        this.gehuurdeAuto = null;
        this.huurder = null;
        this.aantalDagen = 0;
    }

    public void setGehuurdeAuto(Auto auto) {
        this.gehuurdeAuto = auto;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto == null || huurder == null) {
            return 0.0;
        }
        double prijs = gehuurdeAuto.getPrijsPerDag() * aantalDagen;
        double korting = (prijs * huurder.getKorting()) / 100;
        return prijs - korting;
    }

    @Override
    public String toString() {
        String autoInfo = (gehuurdeAuto != null) ? gehuurdeAuto.toString() + "\n" : "er is geen auto bekend\n";
        String huurderInfo = (huurder != null) ? "op naam van: " + huurder + "\n" : "er is geen huurder bekend\n";
        return autoInfo + huurderInfo + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}

