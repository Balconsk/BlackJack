package org.balconsk.cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CardDeckEmptyTest {
    private CardDeck cardDeck;
    private static CardFabric cardFabric;
    @BeforeAll
    static void setup(){
        cardFabric = new CardFabric(new Random());
    }

    @BeforeEach
    void setupEach(){
        cardDeck = new CardDeckEmpty();
    }

    @Test
    void addCardToDeckAndGetCard(){
        Card[] cards = cardFabric.getRandomCards(10);
        for (Card c: cards){
            cardDeck.addCardToDeck(c);
        }
        for (Card c: cards){
            Assertions.assertEquals(c, cardDeck.getCard());
        }
    }

    @Test
    void addCardsToDeckAndGetCard(){
        Card[] cards = cardFabric.getRandomCards(10);
        cardDeck.addCardToDeck(cards);
        for (Card c: cards){
            Assertions.assertEquals(c, cardDeck.getCard());
        }
    }

    @Test
    void size(){
        Assertions.assertEquals(0,cardDeck.size());

        cardDeck.addCardToDeck(cardFabric.getRandomCard());
        Assertions.assertEquals(1,cardDeck.size());

        cardDeck.addCardToDeck(cardFabric.getRandomCards(10));
        Assertions.assertEquals(11,cardDeck.size());


    }
}
