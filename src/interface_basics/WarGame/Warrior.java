package interface_basics.WarGame;

public class Warrior implements Attackable{


    @Override
    public void attack() {
        System.out.println("Kılıç salladı!");
    }
}
