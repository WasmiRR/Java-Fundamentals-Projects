package automotive.system;

public enum EngineType {

    TSI(150),
    TDI(115),
    ACT(130);

    private final int horsepower;

    private EngineType (int horsepower){
    this.horsepower = horsepower;
    }


    public int getHorsepower(){
        return horsepower;
    }

}
