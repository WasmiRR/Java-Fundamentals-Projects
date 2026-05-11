package chess_project;

public class SatrancTasi {
String tasIsmi;
String renk;

public SatrancTasi(String tasIsmi, String renk){
this.tasIsmi = tasIsmi;
this.renk = renk;
}

public SatrancTasi(String tasIsmi){
    this(tasIsmi, "Beyaz");
}

public void hamleYap(String hedefKare){
    System.out.println(renk + tasIsmi + " taşı" + hedefKare + " karesine ilerledi!");
}



}
