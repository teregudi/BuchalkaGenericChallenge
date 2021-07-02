import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    private ArrayList<T> members;

    public Team(){
        
        members = new List<>();
    }
}
