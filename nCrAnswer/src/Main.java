import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        
        int n , i , r , nfac = 1 , rfac = 1 , nrfac = 1;


        Scanner value1 = new Scanner(System.in);
        System.out.print("Please write n number : ");
        n = value1.nextInt();

        Scanner value2 = new Scanner(System.in);
        System.out.print("Please write r number : ");
        r = value2.nextInt();

        for (i = 1; i <= n; i++){

            nfac = i * nfac;
        }

        System.out.println("n factorial : " + nfac);


        for (i = 1; i <= r; i++){

            rfac = i * rfac;

        }

        System.out.println("r factorial : " + rfac);

        for (i = 1; i <= (n-r); i++){

            nrfac = i * nrfac;
            
        }

        System.out.println("Combinations nCr answer : " + (nfac/(rfac*(nrfac))));


    }
}
