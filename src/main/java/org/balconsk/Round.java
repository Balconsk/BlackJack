package org.balconsk;

import org.balconsk.Players.Player;

public interface Round {
    public void nextTurn();
    public void roundStart();
    public void roundEnd();
    public void getResult();
    public Dealer getDealer();
    public Player[] getAllPlayers();
    public Player getPlayer(int index);
}


