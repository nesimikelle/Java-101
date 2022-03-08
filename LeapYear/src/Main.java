import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int valueYear ;

        Scanner value1 = new Scanner(System.in);

        System.out.print("Write the year : ");
        valueYear = value1.nextInt();

        if ((valueYear % 100) == 0){
            if ((valueYear % 400) == 0){
                System.out.print(valueYear + " is a Leap Year");
            }else {
                System.out.print(valueYear + " is not a Leap Year");
            }
        }else {
            if ((valueYear % 4) == 0){
                System.out.print(valueYear + " is a Leap Year");
            }else {
                System.out.print(valueYear + " is not a Leap Year");
            }
        }

    }
}
