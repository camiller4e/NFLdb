package models.Teams;

import models.Staff.Manager;
import models.Staff.Players.Player;

import java.util.List;

public class Team {
    private int id;
    private String name;
    private Manager manager;
    private List<Player> players;
    private int wins;

    public Team(String name, Manager manager, List<Player> players, int wins) {
        this.name = name;
        this.manager = manager;
        this.players = players;
        this.wins = wins;
    }

    public Team() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
