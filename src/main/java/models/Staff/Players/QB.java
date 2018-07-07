package models.Staff.Players;

public class QB extends Player {

    public QB(String name, int salary, int playerNum) {
        super(name, salary, playerNum);
    }

    public QB() {
    }

    public String pass(){
        return getName() + " there, throwing frozen ropes";
    }
}
