package automotive.system;

public class Vehicle {

    private String modelName;
    private EngineType engine;
    private int currentRpm;

    public Vehicle(String modelName, EngineType engine) {
        this.modelName = modelName;
        this.engine = engine;
        currentRpm = 800;

    }

    public String getModelName() {
        return modelName;
    }

    public EngineType getEngine() {
        return engine;
    }


    public int getCurrentRpm() {

        return currentRpm;

    }

    public void setCurrentRpm(int rpm) {
        if (rpm > 6000) {
            System.out.println("Warning: Redline limit exceeded! Engine protected.");

        } else {
            currentRpm = rpm;
        }

    }

}