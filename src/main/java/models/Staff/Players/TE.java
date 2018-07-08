package models.Staff.Players;

import models.Teams.Team;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tight_ends")
public class TE extends Player {

    public TE(String name, int salary, int playerNum, Team team) {
        super(name, salary, playerNum, team);
    }

    public TE() {
    }
}
