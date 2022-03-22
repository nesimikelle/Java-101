import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        Scanner value1 = new Scanner(System.in);
        System.out.print("Please write any number : ");
        x = value1.nextInt();


        for (int i = 0; i < x; i++) {
            for (int j = 1; j < (x - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x; i > 1; i--) {
            for (int j = 1; j < (x - i + 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 3); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
