package game_server;

public class GameServer {

    private GameCharacter[] players;


    public GameServer() {

        players = new GameCharacter[3];

        players[0] = new GameCharacter("Mage", 45);
        players[1] = new GameCharacter("Warrior", 60);
        players[2] = new GameCharacter("Rogue", 30);

    }

    public GameCharacter[] getDeepCopyPlayers() {

        GameCharacter[] safeCopy  = new GameCharacter[players.length];

        for (int i = 0; i < players.length; i++) {

            safeCopy[i] = new GameCharacter(players[i].getName(), players[i].getLevel());
        }


        return safeCopy;
    }
}