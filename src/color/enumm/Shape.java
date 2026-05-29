package color.enumm;

public enum Shape {
    CIRCLE ("RED"),
    SQUARE("BLUE"),
    TRIANGLE("GREEN");

    private final String color;

    private Shape(String color){
        this.color= color;
    }

    public String getColor(){
        return color;
    }

}
