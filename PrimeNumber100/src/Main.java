import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean test;

        for (int m = 2; m <= 100; m++){
            test = true;
            for (int i = 2; i < m; i++) {
                if (m % i == 0){
                    test = false;
                    break;
                }
            }
            if (test){
                System.out.print(m + " , ");
            }
        }

    }
}
