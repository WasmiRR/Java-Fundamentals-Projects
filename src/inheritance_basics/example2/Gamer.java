package inheritance_basics.example2;

public class Gamer {

    private String username;


    public Gamer (String username){
    this.username = username;
    }

    public String getUsername(){
        return username;
    }


    public void play(){
        System.out.println("Sıradan bir oyuncu maça girdi...");
    }



}