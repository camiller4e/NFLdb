package models.Staff.Players;

public class RB extends Player {

    public RB(String name, int salary, int playerNum) {
        super(name, salary, playerNum);
    }

    public RB() {
    }

    public String run(){
        return getName() + " manages to gain five yards";
    }
}
