package Chess_Player;

public class ChessPlayer {

    private String playerName;
    private int eloRating;

    public static int totalPlayers;

    public ChessPlayer (String playerName, int eloRating){
        this.eloRating = eloRating;
        this.playerName = playerName;
        totalPlayers++;
    }

    public int getElo(){
        return eloRating;
    }

    public void winMatch(int eloGained){
        eloRating += eloGained;
    }

    public static void showTournamentSize(){
        System.out.println("Turnuvadaki toplam oyuncu sayısı: " + totalPlayers);
    }



}

