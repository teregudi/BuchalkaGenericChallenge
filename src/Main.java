public class Main {

    public static void main(String[] args) {

        FootballPlayer fbPlayer1 = new FootballPlayer("Edgar Davids");
        FootballPlayer fbPlayer2 = new FootballPlayer("Dennis Praet");

        SnookerPlayer snPlayer1 = new SnookerPlayer("Ronnie O'Sullivan");
        SnookerPlayer snPlayer2 = new SnookerPlayer("Shaun Murphy");

        Team<FootballPlayer> fbTeam1 = new Team<>("Arsenal");
        Team<FootballPlayer> fbTeam2 = new Team<>("Juventus");
        Team<FootballPlayer> fbTeam3 = new Team<>("Real Madrid");
        Team<FootballPlayer> fbTeam4 = new Team<>("Fradi");

        fbTeam1.addMember(fbPlayer1);
        fbTeam2.addMember(fbPlayer2);

        Team<SnookerPlayer> snTeam1 = new Team<>("Crucible");
        Team<SnookerPlayer> snTeam2 = new Team<>("Hoax");

        League<Team<FootballPlayer>> league1 = new League<>("Bundesliga");
        league1.addTeam(fbTeam1);
        league1.addTeam(fbTeam2);
        league1.addTeam(fbTeam3);
        league1.addTeam(fbTeam4);

        league1.showLeagueTable();

        league1.playLeague();

        System.out.println();
        league1.showLeagueTable();
    }
}
