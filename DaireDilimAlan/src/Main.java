import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi , r , alan , aci ;


        Scanner veri = new Scanner(System.in);

        System.out.print("Yarı çap uunluğunu giriniz (cm) : ");
        r = veri.nextDouble();

        System.out.print("Açıyı giriniz (derece) : ");
        aci = veri.nextDouble();

        pi = 3.14;

        alan = (pi * (r*r) * aci) / 360;

        System.out.println("Daire diliminin alanı : " + alan + " cm2");

    }
}
