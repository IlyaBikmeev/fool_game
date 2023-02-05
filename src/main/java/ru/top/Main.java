package ru.top;

import ru.top.models.Game;
import ru.top.models.Player;

import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя первого игрока...");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите имя второго игрока...");
        Scanner scanner1 = new Scanner(System.in);
        String name1 = scanner1.nextLine();
        Player firstPlayer = new Player(name);
        Player secondPlayer = new Player(name1);
        Game game = new Game(firstPlayer, secondPlayer);
        game.play();
    }
}
