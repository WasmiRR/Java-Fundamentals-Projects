package game_server;


public class GameCharacter implements Comparable <GameCharacter> {

    private String name;
    private int level;


    public GameCharacter (String name, int level) {
        this.name = name;
        this.level = level;
    }


    public int getLevel(){
    return level;
    }

    public String getName() {
        return name;
    }


    public int compareTo(GameCharacter other){

        return Integer.compare(other.level, this.level);
    }


    public String toString(){
        return "Your character name is: " + name + " Level: " + level;
    }

}