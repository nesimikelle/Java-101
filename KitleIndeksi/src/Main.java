import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy , kilo , indeks;


        Scanner veri = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz (m) : ");
        boy = veri.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz (kg) : ");
        kilo = veri.nextDouble();


        indeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}
