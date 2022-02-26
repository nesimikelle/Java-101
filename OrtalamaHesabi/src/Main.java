import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double matematik, turkce, tarih, kimya, fizik, biyoloji;
        double ortalama;
        double toplam;

        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematik = giris.nextDouble();
        System.out.print("Turkçe notunuzu giriniz:");
        turkce = giris.nextDouble();
        System.out.print("Tarih notunuzu giriniz:");
        tarih = giris.nextDouble();
        System.out.print("Kimya notunuzu giriniz:");
        kimya = giris.nextDouble();
        System.out.print("Fizik notunuzu giriniz:");
        fizik = giris.nextDouble();
        System.out.print("Biyoloji notunuzu giriniz:");
        biyoloji = giris.nextDouble();

        toplam = (matematik + turkce + tarih + kimya + fizik + biyoloji);
        ortalama = (toplam/6);
        boolean gecti = ortalama > 60.0;
        System.out.println("Ortlamanız : " + ortalama);
        String gec = gecti ? "Tebrikler Sınıfı Geçtiniz" : "Üzgünüm Kaldınız" ;
        System.out.print(gec);


    }
}
