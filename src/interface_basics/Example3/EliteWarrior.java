package interface_basics.Example3;


public class EliteWarrior implements Attackk, Trainable {

    @Override
    public void attack(){

        System.out.println("Saldırı başarıyla gerçekleştirildi!");

    }

    @Override
    public void train(){
        System.out.println("Savaşçı başarıyla eğitildi.");
    }

}
