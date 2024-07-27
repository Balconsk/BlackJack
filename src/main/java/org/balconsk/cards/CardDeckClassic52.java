package org.balconsk.cards;


public class CardDeckClassic52 extends CardDeckEmpty {
    public CardDeckClassic52() {
        for(SuitOfCard suit: SuitOfCard.values()){
            for(CardRank rank: CardRank.values()){
                this.addCardToDeck( new Card(rank, suit) );
            }
        }

    }

}
