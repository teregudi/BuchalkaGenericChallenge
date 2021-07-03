import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    
    private String name;
    private ArrayList<T> teams;

    /**
     Make sure to use a generic when declaring League!
     */
    public League(String name){
        this.name = name;
        teams = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addTeam(T team){
        if (team == null || teams.contains(team)){
            return false;
        }
        teams.add(team);
        return true;
    }

    /**
     * Print the current team order of the league on the screen
     */
    public void showLeagueTable(){
        Collections.sort(teams);
        for (T t : teams){
            System.out.println(t.getName() + " : " + t.getRank());
        }
    }

    public void playLeague(){
        for(T t1 : teams){
            for(T t2 : teams){
                if (t1 == t2) continue;
                t1.matchResult(t2);
            }
        }
    }
}
