package basics.interfacee.example1;

public class Rectangle implements Measurable {

    private double height, width;


    public Rectangle(double height, double width){
        this.width = width;
        this.height = height;


    }



    @Override
    public double getPerimeter(){
        return 2* ( width + height);

    }

    @Override
    public double getArea(){
        return width*height;

    }

}
