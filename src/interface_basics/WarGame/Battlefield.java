package interface_basics.WarGame;

public class Battlefield {
    public static void main(String[] args){

        Attackable[] area = {new Warrior(), new Archer()};

        for (Attackable is: area){
            is.attack();
        }


    }
}
