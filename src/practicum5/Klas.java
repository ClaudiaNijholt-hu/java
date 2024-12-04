package practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC) {
        this.klasCode = kC;
        this.leerlingen = new ArrayList<>();
    }

    // Voegt een leerling toe aan de klas
    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    // Wijzigt het cijfer van een leerling op basis van de naam
    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : leerlingen) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
                return;
            }
        }
    }

    // Retourneert de lijst van leerlingen
    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    // Retourneert het aantal leerlingen in de klas
    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("In klas ").append(klasCode).append(" zitten de volgende leerlingen: \n");
        for (Leerling leerling : leerlingen) {
            sb.append(leerling.toString()).append("\n");
        }
        return sb.toString();
    }
}
