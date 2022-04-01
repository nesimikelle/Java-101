import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value1 , value2 , maxnumber = 0 , minnumber = 0;
        Scanner input = new Scanner(System.in);


        System.out.print("How many numbers will you write? : ");
        value1 = input.nextInt();

        for (int i = 1; i <= value1; i++) {
            System.out.print( "Please write number" + i + " : ");
            value2 = input.nextInt();


            if (value2 > maxnumber) {
                if (minnumber == 0) {
                    minnumber = value2;
                }
                maxnumber = value2;
            }
            if (value2 < minnumber) {
                if (maxnumber == 0) {
                    maxnumber = value2;
                }
                minnumber = value2;
            }


        }
           
        System.out.println("Largest number : " + maxnumber);
        System.out.print("Smallest number : " + minnumber);


    }
}
