package core_banking_system;

public enum BankSystem {
    VADESIZ (0.0),
    VADELI (0.05),
    KREDI (0.15);

    private final double faizOrani;

    private BankSystem(double faizOrani){
    this.faizOrani = faizOrani;
    }


    public double getFaizOranı(){
        return faizOrani;
    }
}





