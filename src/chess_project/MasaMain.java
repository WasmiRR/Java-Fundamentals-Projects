package chess_project;

public class MasaMain {
    public static void main(String[] args){
        SatrancTasi at = new SatrancTasi(" AT", "Beyaz");
        SatrancTasi piyon = new SatrancTasi(" Piyon");
        at.hamleYap(" E4");
        piyon.hamleYap(" F2");
    }
}
