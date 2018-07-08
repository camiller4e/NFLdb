package models.Staff.Players;

import models.Teams.Team;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "runningbacks")
public class RB extends Player {

    public RB(String name, int salary, int playerNum, Team team) {
        super(name, salary, playerNum, team);
    }

    public RB() {
    }

    public String run(){
        return getName() + " manages to gain five yards";
    }
}
