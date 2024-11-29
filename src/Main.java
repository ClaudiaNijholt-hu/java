import practicum6a.Game;
import practicum6a.Persoon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Maak enkele Game-objecten
        Game g1 = new Game("Just Cause 3", 2015, 59.99);
        Game g2 = new Game("Cyberpunk 2077", 2020, 69.99);
        Game g3 = new Game("The Witcher 3", 2015, 49.99);

        // Maak een Persoon-object en voeg games toe
        Persoon p1 = new Persoon("Klaas", 150.00);
        p1.koop(g1); // Klaas koopt Just Cause 3
        p1.koop(g3); // Klaas koopt The Witcher 3

        // Test de zoekGameOpNaam-methode
        Game game1 = p1.zoekGameOpNaam("Just Cause 3");
        System.out.println("p1 heeft Just Cause 3 " + (game1 != null ? "wel!" : "niet!"));

        Game game2 = p1.zoekGameOpNaam("Cyberpunk 2077");
        System.out.println("p1 heeft Cyberpunk 2077 " + (game2 != null ? "wel!" : "niet!"));

        ArrayList<Game> teKoop = new ArrayList<Game>();
        teKoop.add(new Game("Mario Kart 8", 2019, 35.00));
        teKoop.add(g1);
        ArrayList<Game> nogNietInBezit = p1.bepaalGamesNietInBezit(teKoop);
        System.out.println("p1 heeft de volgende games nog niet: " + nogNietInBezit.toString());
    }
}
