import db.DBHelper;
import models.Staff.Manager;
import models.Teams.Team;
import models.Tournaments.Tournaments;

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

    }
}
