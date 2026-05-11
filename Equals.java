public class Equals {
    public static void main(String[] args){
        String kelime1= "Kola";
        String kelime2= "Kola";
        if (kelime1.equals(kelime2)) {
            System.out.println("Bunlar eşit");
        } else if(kelime1.equalsIgnoreCase(kelime2)){
            System.out.println("Bunlar yanlızca büyük/küçük fark etmezse eşit.");
            }
        else{
            System.out.println("Bunlar eşit değil.");
            }
        }
    }


