package models.Teams;

import models.Staff.Manager;
import models.Staff.Players.Player;
import models.Tournaments.Tournaments;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {
    private int id;
    private String name;
    private Manager manager;
    private List<Player> players;
    private Tournaments tournament;
    private int wins;

    public Team(String name, int wins, Manager manager, Tournaments tournament) {
        this.name = name;
        this.wins = wins;
        this.manager = manager;
        this.tournament = tournament;
    }

    public Team() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(mappedBy = "team", fetch = FetchType.LAZY)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Column(name = "wins")
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }
}
