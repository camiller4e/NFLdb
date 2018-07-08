package models.Staff.Players;

import models.Teams.Team;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "quarterbacks")
public class QB extends Player {

    public QB(String name, int salary, int playerNum, Team team) {
        super(name, salary, playerNum, team);
    }

    public QB() {
    }

    public String pass(){
        return getName() + " there, throwing frozen ropes";
    }
}
