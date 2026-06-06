package interface_basics.Area;

public class InterfacePolyDemo {


    public static void main(String[] args) {
        Measurable[] shapes = { new Rectangle(4, 6), new Circle(3), new Rectangle(10, 2) };

        for (Measurable s : shapes) {
            display(s);
            System.out.println();
        }
    }

    public static void display(Measurable figure) {
        System.out.printf("Perimeter: %.2f%n", figure.getPerimeter());
        System.out.printf("Area: %.2f%n", figure.getArea());
    }
}