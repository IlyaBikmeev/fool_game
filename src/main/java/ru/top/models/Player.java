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

    /**
     *
     * @param i номер карты в его списке, которую он хочет выкинуть
     * @return карту, которую игрок выкинул
     */
    public Card attack(int i) {
        return null;
    }

    /**
     *
     * @param card - карта, которую надо побить
     * @param trumpSuit - козырь
     * @return карту, которой игрок побился в случае удачной защиты,
     * null - если так защититься нельзя
     */
    public Card defend(Card card, Suit trumpSuit) {
        return null;
    }


    public void takeCard(Card card) {
        cards.add(card);
    }

    public void takeCards(Collection<Card> cards) {
        this.cards.addAll(cards);
    }
}
