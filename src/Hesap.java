public class Hesap {

    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    // constructor oluşturuyoruz.

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    // getter setter methodlarımızı yazıyoruz ve bu şekilde yapımızı oluşturmuş oluyoruz.
    // getter setter methodlarında işlemlerimizi yapmamız gerekiyor.


    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    // para yatırma ve para çekme methodlarımızı yazıyoruz.

    public void paraYatir(int tutar) {
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz : " + bakiye);
    }

    public void paraCek(int tutar) { // para çekilecek tutar bakiyeden yüksek ise para çekemez
        if ((bakiye - tutar) < 0) {
            System.out.println("Bakiye Yetersiz");
        } else {
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz : " + bakiye);

        }
    }


}
