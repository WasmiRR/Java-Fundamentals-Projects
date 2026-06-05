package game_server;

import java.util.Arrays;



public class Main {
    public static void main(String[] args){

        GameServer server = new GameServer();


        GameCharacter[] activePlayers = server.getDeepCopyPlayers();


        Arrays.sort(activePlayers);

        System.out.println("--- SUNUCU ŞAMPİYONLARI (LEVEL BÜYÜKTEN KÜÇÜĞE) ---");

        for (GameCharacter player : activePlayers) {

            System.out.println(player);
        }

    }
}
