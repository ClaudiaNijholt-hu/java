package practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasNaam;
    private ArrayList<Leerling> leerlingen;

    public Klas(String klasNaam) {
        this.klasNaam = klasNaam;
        this.leerlingen = new ArrayList<>();
    }

    // Voegt een leerling toe aan de klas
    public void voegLeerlingToe(Leerling leerling) {
        leerlingen.add(leerling);
    }

    // Wijzigt het cijfer van een leerling op basis van de naam
    public void wijzigCijfer(String naam, double cijfer) {
        for (Leerling leerling : leerlingen) {
            if (leerling.getNaam().equals(naam)) {
                leerling.setCijfer(cijfer);
                return; // Stop zodra we de leerling gevonden hebben
            }
        }
        System.out.println("Leerling " + naam + " niet gevonden!");
    }

    // Retourneert het aantal leerlingen in de klas
    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("In klas ").append(klasNaam).append(" zitten de volgende leerlingen: \n");
        for (Leerling leerling : leerlingen) {
            sb.append(leerling.toString()).append("\n");
        }
        return sb.toString();
    }
}
