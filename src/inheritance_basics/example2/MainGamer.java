package inheritance_basics.example2;

public class MainGamer {
    public static void main(String[] args){

        Gamer[] filo = new Gamer[2];


        filo[0] = new Gamer("Noob123");
        filo[1] = new ProGamer("Enes", "Monster");


        for (int i=0; i< filo.length; i++){
            filo[i].play();
        }
    }
}
