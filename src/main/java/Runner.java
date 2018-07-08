import db.DBHelper;
import db.DBTeam;
import models.Staff.Manager;
import models.Staff.Players.*;
import models.Teams.Team;
import models.Tournaments.Tournaments;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Adam Gase", 5000000);
        DBHelper.save(manager1);

        Manager manager2 = new Manager("Mike Vrabel", 3500000);
        DBHelper.save(manager2);

        Manager manager3 = new Manager("Mike McCarthy", 6000000);
        DBHelper.save(manager3);

        Manager manager4 = new Manager("Steven Wilks", 2750000);
        DBHelper.save(manager4);

        Team dolphins = new Team("Miami Dolphins", 4, manager1, Tournaments.AFC);
        DBHelper.save(dolphins);

        Team titans = new Team("Tennessee Titans", 3, manager2, Tournaments.AFC);
        DBHelper.save(titans);

        Team packers = new Team("Green Bay Packers", 3, manager3, Tournaments.NFC);
        DBHelper.save(packers);

        Team cardinals = new Team("Arizona Cardinals", 2, manager4, Tournaments.NFC);
        DBHelper.save(cardinals);

        Player QB1 = new QB("Aaron Rodgers", 9000000, 12, packers);
        DBHelper.save(QB1);

        Player RB1 = new RB("Aaron Jones", 1000000, 33, packers);
        DBHelper.save(RB1);

        Player WR1 = new WR("Davante Adams", 1500000, 17, packers);
        DBHelper.save(WR1);

        Player TE1 = new TE("Jimmy Graham", 3000000, 80, packers);
        DBHelper.save(TE1);

        Player K = new K("Mason Crosby", 1000000, 2, packers);
        DBHelper.save(K);

        packers.addPlayer(QB1);
        packers.addPlayer(RB1);
        packers.addPlayer(WR1);
        packers.addPlayer(TE1);
        packers.addPlayer(K);

        List<Player> allPlayersOnTeam = DBTeam.getPlayersOnTeam(packers);


    }
}
