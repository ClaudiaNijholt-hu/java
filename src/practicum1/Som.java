package practicum1;

public class Som {
    public static void main(String[] args) {
        int som = 0;
        for (int i = 0; i <= 39; i++) {
            som += i;
        }
        System.out.println("De som van de getallen 0 tot en met 39 is: " + som);
    }
}
