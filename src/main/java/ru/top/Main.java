package ru.top;

import ru.top.models.Game;
import ru.top.models.Player;

public class Main {
    public static void main(String[] args) {
        Player firstPlayer = new Player(null);
        Player secondPlayer = new Player(null);
        Game game = new Game(firstPlayer,secondPlayer);
        game.play();
    }
}
