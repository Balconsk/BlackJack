package org.balconsk.cards;


public interface CardDeck {
    public Card getCard();
    public void shuffleDeck();
    public void addCardToDeck(Card card);
    public void addCardsToDeck(Card[] cards);
}
