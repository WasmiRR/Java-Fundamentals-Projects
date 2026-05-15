package car_speed;
public class Car {

    private String model;
    private int speed;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }
    public int getSpeed() {
        return this.speed;
    }
    public String getModel() {
        return this.model;
    }
    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 220) {
            this.speed = speed;
            System.out.println(this.model + " yeni hizi: " + this.speed);
        } else {
            System.out.println("Hata! Gecersiz hiz girdiniz.");
        }
    }

}