import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a , b , c , cevre , alan ;


        Scanner KenarUzunluk = new Scanner(System.in);

        System.out.print("a Kenarı Uzunluğunu Giriniz (cm) : ");
        a = KenarUzunluk.nextInt();

        System.out.print("b Kenarı Uzunluğunu Giriniz (cm) : ");
        b = KenarUzunluk.nextInt();

        System.out.print("c Kenarı Uzunluğunu Giriniz (cm) : ");
        c = KenarUzunluk.nextInt();

        cevre = (a+b+c);
        alan = (a*b)/2;

        System.out.println("Üçgenin Çevresi : " + cevre + " cm");
        System.out.println("Üçgenin Çevresi : " + alan + " cm2");

    }
}
