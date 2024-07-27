package org.balconsk.cards;

import java.util.Random;

public class CardFabric {
    private final Random random;

    public CardFabric(Random random) {
        this.random = random;
    }

    public Card getRandomCard(){
        return new Card(getRandomCardRank(), getRandomSuitOfCard());
    }
    public Card[] getRandomCards(int numberOfCards){
        Card[] cards = new Card[numberOfCards];
        for(int i = 0; i<numberOfCards; i++){
            cards[i] = getRandomCard();
        }
        return cards;
    }
    public CardRank getRandomCardRank(){
        CardRank[] cardRanks = CardRank.values();
        return cardRanks[ random.nextInt(cardRanks.length) ];
    }

    public SuitOfCard getRandomSuitOfCard(){
        SuitOfCard[] suitOfCards = SuitOfCard.values();
        return suitOfCards[ random.nextInt(suitOfCards.length) ];
    }
}
