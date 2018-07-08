package models.Staff.Players;

import models.Teams.Team;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kickers")
public class K extends Player {

    public K(String name, int salary, int playerNum, Team team) {
        super(name, salary, playerNum, team);
    }

    public K() {
    }

    public String kick(){
        return getName() + " kicks the ball!";
    }

}
