import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value1 , sum = 0;
        Scanner input = new Scanner(System.in);
        boolean control = false;

        do {
            System.out.print("Please write any number : ");
            value1 = input.nextInt();

            for (int i = 1; i <= value1; i++) {

                if (value1 % i == 0){
                    sum = sum + i;
                }
                else {
                    continue;
                }
            }
            if (sum == (value1*2)){
                System.out.println("This number is Perfect number");
                control = false;
                sum = 0;
            }else {
                System.out.println("This number is not Perfect number");
                control = true;
                sum = 0;
            }
        }while (control);

    }
}
