import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double MalFiyati , KdvOrani , DusukKdv , YuksekKdv , KdvliFiyat ;

        
        Scanner FiyatBilgisi = new Scanner(System.in);

        System.out.print("Malın Fiyatı : ");
        MalFiyati = FiyatBilgisi.nextInt();

        KdvOrani = (MalFiyati < 1000) ? 0.18 : 0.08 ;
        KdvliFiyat = (MalFiyati+(MalFiyati*KdvOrani));

        System.out.println("Malın KDV Hariç Fiyatı : " + MalFiyati + " TL");
        System.out.println("Malın KDV Oranı : " +"%"+ (KdvOrani*100));
        System.out.println("Malın KDV'li Fiyatı : " + KdvliFiyat + " TL");



    }
}
