package coffe_workshop;

public class CoffeOrder {

    private String coffeeName;
    private double price;

    public static int totalCoffeesSold= 0;


    public CoffeOrder(String coffeeName, double price){
        this.coffeeName = coffeeName;
        this.price = price;
        totalCoffeesSold++;
    }

    public double getPrice(){
        return price;
    }

    public void applyPromoCode(double discount){
        price = price-discount;

    }


    public static void showDailySales(){
        System.out.println("Bugün satılan toplam kahve: " + totalCoffeesSold);

    }




}
