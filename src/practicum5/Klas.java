package practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC) {
        this.klasCode = kC;
        this.leerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public short wijzigCijfer(String nm, double nweCijfer) {
        Leerling leerling = new Leerling(nm);

        if (leerling.getNaam().equals(nm)) {
            leerling.setCijfer(nweCijfer);
            return 0;
        }

        return -1;
    }

    public int aantalLeerlingen() {
        return leerlingen.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("In klas ").append(klasCode).append(" zitten de volgende leerlingen: \n");
        for (Leerling leerling : leerlingen) {
            sb.append(leerling.toString()).append("\n");
        }
        return sb.toString();
    }
}