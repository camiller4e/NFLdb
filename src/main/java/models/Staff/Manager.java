package models.Staff;

import models.Teams.Team;

public class Manager extends TeamMember {
    private Team team;

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public Manager() {
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
