package practicum7;

public class HoofdletterProces implements OpmaakProces {
    @Override
    public String maakOp(String input) {
        return input.toUpperCase();
    }
}
