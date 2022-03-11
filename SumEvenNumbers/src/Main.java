import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int a , sum = 0 ;

        Scanner value1 = new Scanner(System.in);

        System.out.print("Please write any number : ");
        a = value1.nextInt();

        for (int i = 0 ; i < a; i++){
            if (i % 3 == 0 && i % 4 == 0 ){

                sum += i;

            }else{
                continue;
            }
        }

        System.out.print("Sum of even numbers : " + sum);


    }
}
