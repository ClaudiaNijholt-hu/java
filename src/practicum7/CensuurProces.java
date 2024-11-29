package practicum7;

public class CensuurProces implements OpmaakProces {
    private String[] ongewensteWoorden = {"student", "stage"};

    @Override
    public String maakOp(String input) {
        for (String woord : ongewensteWoorden) {
            input = input.replaceAll("(?i)\\b" + woord + "\\b", "****");
        }
        return input;
    }
}
