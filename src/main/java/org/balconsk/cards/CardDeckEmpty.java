package org.balconsk.cards;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeckEmpty implements CardDeck{
    private final ArrayList<Card> cards;

    public CardDeckEmpty(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public CardDeckEmpty(){
        this(new ArrayList<Card>());
    }

    @Override
    public Card getCard() {
        return cards.remove(0);
    }

    @Override
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    @Override
    public void addCardToDeck(Card card) {
        cards.add(card);
    }

    @Override
    public void addCardToDeck(Card[] cards) {
        for (Card card:
             cards) {
            this.addCardToDeck(card);
        }
    }

    @Override
    public int size() {
        return cards.size();
    }
}
