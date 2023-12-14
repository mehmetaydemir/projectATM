public class Main {


    public static void main(String[] args) {
        // Login Class'ı  Kullanıcı Girişi Kontrol edecek

        // Hesap Class'ı Hesap İşlemlerinini Yapacak

        // ATM ise aymmizi çalıştıracak

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Mehmet","12345",2000);
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor");



    }
}