package arrays_product;

public class Product {

    private String name;
    private double price;
    private int quantity;


    public Product (String name, double price, int quantity){

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public double totalValue(){

        double cost = price * quantity;
        return cost;

    }


    public String toString() {
        return name + " - " + price + " TL " + "X " + quantity;
    }


}
