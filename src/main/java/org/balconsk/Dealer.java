package org.balconsk;

import org.balconsk.cards.Card;
import org.balconsk.Players.Player;

public interface Dealer {
    public void turn();
    public void endRound();
    public Card getCard();
    public Player[] checkIfThereAnyLosers();
    public void setPlayers(Player[] players);
}
