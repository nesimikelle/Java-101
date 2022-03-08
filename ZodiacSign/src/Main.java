import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int birthYear , mode ;

        Scanner value1 = new Scanner(System.in);

        System.out.print("Write your date of birth (year) : ");
        birthYear = value1.nextInt();
        mode = birthYear % 12 ;

        switch (mode) {
            case 0 :
                System.out.print("Chinese Zodiac Sign : Monkey");
                break;
            case 1 :
                System.out.print("Chinese Zodiac Sign : Cockerel");
                break;
            case 2 :
                System.out.print("Chinese Zodiac Sign : Dog");
                break;
            case 3 :
                System.out.print("Chinese Zodiac Sign : Pig");
                break;
            case 4 :
                System.out.print("Chinese Zodiac Sign : Mouse");
                break;
            case 5 :
                System.out.print("Chinese Zodiac Sign : Bull");
                break;
            case 6 :
                System.out.print("Chinese Zodiac Sign : Tiger");
                break;
            case 7 :
                System.out.print("Chinese Zodiac Sign : Rabbit");
                break;
            case 8 :
                System.out.print("Chinese Zodiac Sign : Dragon");
                break;
            case 9 :
                System.out.print("Chinese Zodiac Sign : Snake");
                break;
            case 10 :
                System.out.print("Chinese Zodiac Sign : Horse");
                break;
            case 11 :
                System.out.print("Chinese Zodiac Sign : Sheep");
                break;
            default:
                System.out.print("Your Chinese Zodiac Sign Not Found!");
        }

    }
}
