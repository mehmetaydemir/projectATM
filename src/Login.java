import java.util.Scanner;

public class Login {

    // kullanıcı girişi kontrol etmek için login classı yazıyoruz.

    public boolean login(Hesap hesap) {

        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.print("Kullanıcı Adı : ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Şifre : ");
        parola = scanner.nextLine();

        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }

    }


}
