package interface_basics.WarGame;

public class Archer implements Attackable{

    @Override
    public void attack() {
        System.out.println("Ok fırlattı!");
    }
}
