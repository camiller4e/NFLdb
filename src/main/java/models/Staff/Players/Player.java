package models.Staff.Players;

import models.Staff.TeamMember;

public class Player extends TeamMember {
    private int playerNum;

    public Player(String name, int salary, int playerNum) {
        super(name, salary);
        this.playerNum = playerNum;
    }

    public Player() {
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }
}
