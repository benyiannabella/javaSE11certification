public class FootballTeam implements Comparable<FootballTeam> {

    private String name;
    public FootballTeam(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(FootballTeam o) {
        return this.getName().compareTo(o.getName());
    }

    public String toString(){
        return this.name;
    }
}
