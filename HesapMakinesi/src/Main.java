import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double firstValue , secondValue;
        int islem;
        Scanner value = new Scanner(System.in);

        System.out.print("İlk Değeri Giriniz : ");
        firstValue = value.nextDouble();

        System.out.print("İkinci Değeri Giriniz : ");
        secondValue = value.nextDouble();

        System.out.print("İslem Değeri Giriniz\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme : ");
        islem = value.nextInt();

        switch (islem){

            case 1:
                System.out.print("Sonuç : " + (firstValue+secondValue));
                break;

            case 2:
                System.out.print("Sonuç : " + (firstValue-secondValue));
                break;

            case 3:
                System.out.print("Sonuç : " + (firstValue*secondValue));
                break;

            case 4:
                System.out.print("Sonuç  : " + (firstValue/secondValue));
                break;

            default:
                System.out.print("Boyle Bir İşlem Yok");

        }

    }
}
