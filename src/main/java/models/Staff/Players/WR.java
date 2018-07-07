package models.Staff.Players;

public class WR extends Player {

    public WR(String name, int salary, int playerNum) {
        super(name, salary, playerNum);
    }

    public WR() {
    }

    public String receive(){
        return "Oh! A beautiful catch by " + getName() + "!";
    }
}
