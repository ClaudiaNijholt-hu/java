package practicum7;

public class SamenvattingsProces implements OpmaakProces {
    private int maxLengte;

    public SamenvattingsProces(int maxLengte) {
        this.maxLengte = maxLengte;
    }

    @Override
    public String maakOp(String input) {
        if (input.length() > maxLengte) {
            return input.substring(0, maxLengte) + "...";
        }
        return input;
    }
}

