import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int n , i , r , total = 1 ;

        Scanner value1 = new Scanner(System.in);
        System.out.print("Please write any number : ");
        r = value1.nextInt();

        Scanner value2 = new Scanner(System.in);
        System.out.print("Please write any th number  : ");
        n = value2.nextInt();


        for (i = 1; i <= n; i++){

            total = total * r;

        }

        System.out.println(r + " to the " + n + "th answer : " + total);

        

    }
}
