public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String naam) {
        this.naam = naam;
        this.cijfer = 0.0;
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    @Override
    public String toString() {
        return naam + " heeft cijfer: " + cijfer;
    }
}
