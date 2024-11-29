package practicum3b;

public class Cirkel {
    // Attributen
    private double radius;
    private double x;
    private double y;

    // Constructor
    public Cirkel(double radius, double x, double y) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    // toString methode
    @Override
    public String toString() {
        return "cirkel (" + x + ", " + y + ") met radius: " + radius;
    }
}

