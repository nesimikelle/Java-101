import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a , i;

        Scanner value1 = new Scanner(System.in);
        System.out.print("Please write any number : ");
        a = value1.nextInt();

        for (i = 1; i <= a; i++){

            System.out.println("4 to the " + i + "th : " + Math.pow(4 , i) +
                    "\n5 to the " + i + "th : " + Math.pow(5 , i));

        }

    }
}
