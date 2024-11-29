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
        // Controleer of er genoeg budget is en de game niet al in bezit is
        if (budget >= game.huidigeWaarde() && !games.contains(game)) {
            budget -= game.huidigeWaarde();
            games.add(game);
            return true;
        }
        return false;
    }

    public boolean verkoop(Game game, Persoon koper) {
        // Controleer of de verkoper de game bezit, de koper genoeg budget heeft en de koper de game niet al bezit
        if (games.contains(game) && !koper.games.contains(game) && koper.budget >= game.huidigeWaarde()) {
            games.remove(game);
            koper.games.add(game);
            budget += game.huidigeWaarde();
            koper.budget -= game.huidigeWaarde();
            return true;
        }
        return false;
    }

    public double getBudget() {
        return budget;
    }

    public Game zoekGameOpNaam(String naam) {
        for (Game game : games) {
            if (game.getNaam().equalsIgnoreCase(naam)) { // Vergelijk de naam (hoofdletterongevoelig)
                return game;
            }
        }
        return null; // Game niet gevonden
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teControlerenGames) {
        ArrayList<Game> nietInBezit = new ArrayList<>();

        for (Game game : teControlerenGames) {
            boolean bezitGame = false;
            for (Game gameInBezit : games) {
                if (game.getNaam().equalsIgnoreCase(gameInBezit.getNaam()) &&
                        game.getReleaseJaar() == gameInBezit.getReleaseJaar()) {
                    bezitGame = true;
                    break;
                }
            }
            if (!bezitGame) {
                nietInBezit.add(game);
            }
        }
        return nietInBezit;
    }

    @Override
    public String toString() {
        // Bouw de outputstring op
        StringBuilder sb = new StringBuilder(String.format("%s heeft een budget van €%.2f en bezit de volgende games:", naam, budget));
        for (Game game : games) {
            sb.append("\n").append(game);
        }
        return sb.toString();
    }
}
