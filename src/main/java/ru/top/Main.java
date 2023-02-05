package ru.top;

import ru.top.models.Game;
import ru.top.models.Player;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя первого игрока...");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Player firstPlayer = new Player(name);
        System.out.println("Введите имя второго игрока...");
        scanner = new Scanner(System.in);
        name = scanner.nextLine();
        Player secondPlayer = new Player(name);
        Game game = new Game(firstPlayer, secondPlayer);
        game.play();
    }
}
