package practicum7;

public class VervangProces implements OpmaakProces {
    private String oudeString;
    private String nieuweString;

    public VervangProces(String oudeString, String nieuweString) {
        this.oudeString = oudeString;
        this.nieuweString = nieuweString;
    }

    @Override
    public String maakOp(String input) {
        return input.replace(oudeString, nieuweString);
    }
}
