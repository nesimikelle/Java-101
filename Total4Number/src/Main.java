import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int a  , sum = 0 ;


        Scanner value1 = new Scanner(System.in);

        do {

            System.out.print("Please write positive number : ");
            a = value1.nextInt();

            if (a%2 == 0 && a%4 == 0){
                sum = sum + a;
                System.out.println("Subtotal : " + sum);
            }else {
                break;
            }

        }while (a>0);

        System.out.print("Sum of even numbers : " + sum);


    }
}
