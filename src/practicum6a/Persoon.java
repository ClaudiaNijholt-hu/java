package practicum6a;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> games;

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
        this.games = new ArrayList<>();
    }

    public boolean koop(Game game) {
        if (budget >= game.huidigeWaarde() && !games.contains(game)) {
            budget -= game.huidigeWaarde();
            games.add(game);
            return true;
        }
        return false;
    }

    public boolean verkoop(Game game, Persoon koper) {
        if (games.contains(game) && !koper.games.contains(game) && koper.budget >= game.huidigeWaarde()) {
            games.remove(game);
            koper.games.add(game);
            budget += game.huidigeWaarde();
            koper.budget -= game.huidigeWaarde();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("%s heeft een budget van €%.2f en bezit de volgende games:\n", naam, budget));
        for (Game game : games) {
            sb.append(game).append("\n");
        }
        return sb.toString();
    }
}
