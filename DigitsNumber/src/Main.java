import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int endNumber , total = 0;

        Scanner value1 = new Scanner(System.in);
        System.out.print("Please write any number : ");
        int number = value1.nextInt();

        while (number != 0){
           endNumber = number % 10;
           total = endNumber + total;
           number = number / 10;
        }

        System.out.print("The sum of the digits of the number you write : " + total);


    }
}
