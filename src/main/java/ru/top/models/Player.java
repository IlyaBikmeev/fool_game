package ru.top.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public void giveCard(Card card) {
        cards.add(card);
    }

    public void giveCards(Collection<Card> cards) {
        this.cards.addAll(cards);
    }
}
