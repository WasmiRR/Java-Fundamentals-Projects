package review_for_all;

public enum TrafficLight {


    RED(30),
    YELLOW(5),
    GREEN(45);


    private final int duration;


    private TrafficLight(int duration){
        this.duration = duration;

    }


    public int getDuration() {
        return duration;
    }
}
