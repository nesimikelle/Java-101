import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value1 , before = 0 , current = 1 , sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please write any number : ");
        value1 = input.nextInt();

        System.out.print("Fibonacci number : " + "0 " + "1 ");

        for (int i = 1; i < value1; i++) {

            sum = current + before;
            System.out.print(sum + " ");
            before = current;
            current = sum;

        }

    }
}
