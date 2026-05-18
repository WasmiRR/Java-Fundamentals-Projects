package Chess_Player;

public class TournamentDemo {
    public static void main (String[] args){
        ChessPlayer chessPlayer1 = new ChessPlayer("Magnus Carlsen", 2882);
        ChessPlayer chessPlayer2 = new ChessPlayer("Messi", 1453);

    chessPlayer1.winMatch(15);

    System.out.println("Magnus Carlsen'in guncel ELO'su: " + chessPlayer1.getElo());
    System.out.println("Messi'nin ELO'su: " + chessPlayer2.getElo());

    ChessPlayer.showTournamentSize();


    }
}
