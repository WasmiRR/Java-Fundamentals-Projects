package inheritance_basics.example2;


public class ProGamer extends Gamer {

    private String sponsor;



    public ProGamer (String username, String sponsor){

    super(username);
    this.sponsor = sponsor;


    }

    @Override
    public void play() {
        System.out.println("Pro oyuncu, " + getUsername() + " " + sponsor + " formasıyla oyunda.");
    }
}
