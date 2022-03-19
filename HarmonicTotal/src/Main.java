import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double total = 0 , i ;

        Scanner value1 = new Scanner(System.in);
        System.out.print("Please write any number : ");
        double number = value1.nextDouble();

        for (i = 1; i <= number; i++){

            total = total + (1 / i);

        }

        System.out.print("Harmonic series total : " + total);

    }
}