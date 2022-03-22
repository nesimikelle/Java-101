import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, m , ebob = 1;
        Scanner input = new Scanner(System.in);


        System.out.print("Please write first number : ");
        n = input.nextInt();

        System.out.print("Please write second number : ");
        m = input.nextInt();

        if (n>m){
            for (int i = 1; i <= n; i++ ){
                if ((n % i == 0) && (m % i == 0)){
                    ebob = i;
                }else {
                    continue;
                }
            }
        }else {
            for (int i = 1; i <= m; i++ ){
                if ((n % i == 0) && (m % i == 0)){
                    ebob = i;
                }else {
                    continue;
                }
            }

        }

        System.out.println("GCD : " + ebob);
        System.out.println("LCM : " + (m * n / ebob));


    }
}
