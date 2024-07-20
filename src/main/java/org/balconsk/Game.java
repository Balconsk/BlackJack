package org.balconsk;

import org.balconsk.Players.Player;

public interface Game {
    public void setDealer(Dealer dealer);
    public Dealer getDealer();
    public void addPlayer(Player player);
    public void addPlayer(Player player, int index);
    public Player getPlayer(int index);
    public Player[] getAllPlayers();
    public Round startRound();
}
