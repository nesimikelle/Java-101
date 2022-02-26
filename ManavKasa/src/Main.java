import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, farmut = 2.14 , felma = 3.67 , fdomates = 1.11 , fmuz = 0.95 , fpatlican = 5.00;
        double armut , elma , domates , muz , patlican;


        Scanner veri = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız? : ");
        armut = veri.nextDouble();

        System.out.print("Kaç Kilo Elma Aldınız? : ");
        elma = veri.nextDouble();

        System.out.print("Kaç Kilo Domates Aldınız? : ");
        domates= veri.nextDouble();

        System.out.print("Kaç Kilo Muz Aldınız? : ");
        muz = veri.nextDouble();

        System.out.print("Kaç Kilo Patlıcan Aldınız? : ");
        patlican = veri.nextDouble();

        tutar = (farmut*armut)+(felma*elma)+(fdomates*domates)+(fmuz*muz)+(fpatlican*patlican);

        System.out.println("Toplam Tutar : " + tutar + " TL");

    }
}
