import java.util.ArrayList;
import java.util.Random;

public class Team<T extends Player> implements Comparable<Team<T>>{

    private static Random rnd;
    private String name;
    private ArrayList<T> members;
    private byte rank;

    static {
        rnd = new Random();
    }

    public Team(String name){
        members = new ArrayList<>();
        this.name = name;
        rank = 0;
    }

    public String getName(){
        return this.name;
    }

    public byte getRank(){
        return this.rank;
    }

    public boolean addMember(T newby){
        if (newby == null || members.contains(newby)) return false;
        members.add(newby);
        return true;
    }

    public void matchResult(Team<T> opponent){
        byte hazai = (byte)(this.rank + rnd.nextInt(5));
        if (hazai > 100) hazai = 100;
        byte vendeg = (byte)(opponent.rank + rnd.nextInt(5));
        if (vendeg > 100) vendeg = 100;
        if (hazai > vendeg) this.rank++;
        else if (vendeg > hazai) opponent.rank++;
    }

    @Override
    public int compareTo(Team<T> otherTeam) {
        if (this.rank > otherTeam.rank) return -1;
        if (this.rank < otherTeam.rank) return 1;
        return 0;
    }
}
