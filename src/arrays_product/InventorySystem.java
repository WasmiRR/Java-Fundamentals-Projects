package arrays_product;

public class InventorySystem {
    public static void main (String[] args){

        Product[] inventroy = {
                new Product("Keyboard", 450.00, 2),
                new Product("Mouse", 250.00, 3),
                new Product("Laptop", 780.75, 1),
        };

        double grandTotal = 0;

        for (Product p: inventroy){

            System.out.println(p);

            grandTotal += p.totalValue();
        }

        System.out.println("Grand Total: " + grandTotal + " TL");

    }
}
