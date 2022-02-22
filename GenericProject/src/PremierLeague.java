import java.util.Collections;
import java.util.List;

public class PremierLeague <T extends FootballTeam>{
    private List<T> teams;

    public PremierLeague(List<T> teams) {
        this.teams = teams;
    }

    public List<T> getTeams() {
        return teams;
    }

    public void printTeamList(){
        Collections.sort(teams);
        teams.forEach(System.out :: println);

    }

}
