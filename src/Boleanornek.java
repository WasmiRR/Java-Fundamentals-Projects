public class Boleanornek {
    public static void main(String[] args){
        boolean isRaining = false;
        boolean isSunroofOpen= false;
        boolean isDrainClogged= true;

        boolean leakWarning1 = isRaining && (isSunroofOpen || isDrainClogged );
        boolean leakWarning2 = isRaining && isSunroofOpen || isDrainClogged;

        System.out.println("Sistem 1 uyarı veriyor mu? " + leakWarning1);
        System.out.println("Sistem 2 uyarı veriyor mu? " + leakWarning2);

    }
}
