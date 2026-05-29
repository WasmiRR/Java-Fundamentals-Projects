package core_banking_system;

public class BankaDemo {
    public static void main(String[] args){
        BankSystem secilenHesap = BankSystem.VADELI;

        switch (secilenHesap){
            case VADESIZ:
                System.out.println("Hesabınız vadesizdir. Faiz getirisi yoktur.");
                break;
            case VADELI:
                System.out.println("Hoşgeldin faizi uygulandı! Oran: " + secilenHesap.getFaizOranı());
                break;
            case KREDI:
                System.out.println("Kredi borcunuz bulunmaktadır. Lütfen ödeme yapınız.");
                break;
        }





        System.out.println("Vadeli Hesap; " + secilenHesap.name());

        BankSystem kredi = BankSystem.KREDI;
        System.out.println("Kredi; " + kredi.ordinal());

        BankSystem vadesiz = BankSystem.valueOf("VADESIZ");

        System.out.println("Faiz oranı: " + vadesiz.getFaizOranı());

        System.out.println(vadesiz.compareTo(kredi));


    }
}
