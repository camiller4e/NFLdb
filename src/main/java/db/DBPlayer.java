package db;

import models.Staff.Players.Player;
import models.Teams.Team;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBPlayer {

    private Session session;
    private Transaction transaction;

    public static void addPlayerToTeam(Player player, Team team){
        team.addPlayer(player);
        DBHelper.update(player);
    }
}
