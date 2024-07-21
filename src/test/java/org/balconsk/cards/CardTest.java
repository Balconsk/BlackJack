package org.balconsk.cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {
    @Test
    void getCardRank(){
        SuitOfCard suitOfCard = SuitOfCard.DIAMONDS;
        for(CardRank i: CardRank.values()){
            Card card = new Card(i, suitOfCard);
            Assertions.assertEquals(i, card.cardRank());
        }
    }
    @Test
    void getSuitOfCard(){
        CardRank cardRank  = CardRank.CARD_3;
        for(SuitOfCard i: SuitOfCard.values()){
            Card card = new Card(cardRank, i);
            Assertions.assertEquals(i, card.suitOfCard());
        }
    }
}
