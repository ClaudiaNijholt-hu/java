package practicum3b;

public class Cirkel {
    // Attributen
    private int radius;
    private int xPositie;
    private int yPositie;

    // Constructor
    public Cirkel(int radius, int x, int y) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = radius;
        this.xPositie = x;
        this.yPositie = y;
    }

    // toString methode
    @Override
    public String toString() {
        return "cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}

