package models.Staff.Players;

import models.Staff.TeamMember;
import models.Teams.Team;

import javax.persistence.*;

@Entity
@Table(name = "players")
@Inheritance(strategy = InheritanceType.JOINED)
public class Player extends TeamMember {
    private int playerNum;
    private Team team;

    public Player(String name, int salary, int playerNum) {
        super(name, salary);
        this.playerNum = playerNum;
        this.team = team;
    }

    public Player() {
    }

    @Column(name = "playerNum")
    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
