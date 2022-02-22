import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        PremierLeague<FootballTeam> league = new PremierLeague<>(teams);
        Arsenal a = new Arsenal("Arsenal");
        Arsenal m = new Arsenal("Manchester United");
        Arsenal l = new Arsenal("Liverpool");
        ChicagoBulls c = new ChicagoBulls("Chicago Bulls");
        teams.add(a);
        teams.add(m);
        teams.add(l);
        league.printTeamList();
    }
}
