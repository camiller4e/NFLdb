package models.Staff.Players;

public class K extends Player {

    public K(String name, int salary, int playerNum) {
        super(name, salary, playerNum);
    }

    public K() {
    }

    public String kick(){
        return getName() + " kicks the ball!";
    }

}
