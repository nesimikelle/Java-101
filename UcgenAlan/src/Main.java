import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a , b , c , cevre , alan ;


        Scanner FiyatBilgisi = new Scanner(System.in);

        System.out.print("a Kenarı Uzunluğunu Giriniz (cm) : ");
        a = FiyatBilgisi.nextInt();

        System.out.print("b Kenarı Uzunluğunu Giriniz (cm) : ");
        b = FiyatBilgisi.nextInt();

        System.out.print("c Kenarı Uzunluğunu Giriniz (cm) : ");
        c = FiyatBilgisi.nextInt();

        cevre = (a+b+c);
        alan = (a*b)/2;

        System.out.println("Üçgenin Çevresi : " + cevre + " cm");
        System.out.println("Üçgenin Çevresi : " + alan + " cm2");

    }
}
