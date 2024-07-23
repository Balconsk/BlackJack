package org.balconsk.cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CardFabricTest {
    CardFabric cardFabric;
    RandomFake randomFake;
    @BeforeEach
    private void setup(){
        randomFake = new RandomFake();
        cardFabric = new CardFabric(randomFake);
    }

    @Test
    public void getRandomCardRank(){
        CardRank[] cardRanks = CardRank.values();
        for (int i = 0; i<cardRanks.length; i++){
            randomFake.setReturnNextInt(i);
            CardRank cardRank= cardFabric.getRandomCardRank();
            Assertions.assertEquals(cardRanks[i], cardRank);
            i++;
        }
    }
    @Test
    public void getRandomSuitOfCard(){
        SuitOfCard[] suitOfCards = SuitOfCard.values();
        for (int i = 0; i<suitOfCards.length; i++){
            randomFake.setReturnNextInt(i);
            SuitOfCard suitOfCard= cardFabric.getRandomSuitOfCard();
            Assertions.assertEquals(suitOfCards[i], suitOfCard);
            i++;
        }
    }
}

class RandomFake extends Random {
    private int returnNextInt;
    public void setReturnNextInt(int value){
        returnNextInt = value;
    }
    @Override
    public int nextInt(int stub){
        return returnNextInt;
    }
}