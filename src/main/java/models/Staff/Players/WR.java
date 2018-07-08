package models.Staff.Players;

import models.Teams.Team;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "wide_receivers")
public class WR extends Player {

    public WR(String name, int salary, int playerNum, Team team) {
        super(name, salary, playerNum, team);
    }

    public WR() {
    }

    public String receive(){
        return "Oh! A beautiful catch by " + getName() + "!";
    }
}
