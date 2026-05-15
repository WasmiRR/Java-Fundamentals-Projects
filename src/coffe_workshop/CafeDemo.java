package coffe_workshop;

public class CafeDemo {
    public static void main (String[] args){
        CoffeOrder coffe1 = new CoffeOrder("Americano", 203.00);
        CoffeOrder coffe2 = new CoffeOrder("Caramel Macchiato", 205.00);
        coffe1.applyPromoCode(30.00);
        System.out.println("Americano'nun fiyatı: " + coffe1.getPrice() );
        System.out.println("Caramel Macchioato'nun fiyatı: " + coffe2.getPrice());
        System.out.println("Bugün toplam satılan kahve adeti : " + CoffeOrder.totalCoffeesSold);
    }


}
