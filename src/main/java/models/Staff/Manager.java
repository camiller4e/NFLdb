package models.Staff;

import models.Teams.Team;

import javax.persistence.*;

@Entity
@Table(name = "managers")
@Inheritance(strategy = InheritanceType.JOINED)
public class Manager extends TeamMember {
    private Team team;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public Manager() {
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = true)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
