import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int a , b ,c ;

        Scanner value1 = new Scanner(System.in);

        System.out.print("Write the number a : ");
        a = value1.nextInt();

        System.out.print("Write the number b : ");
        b = value1.nextInt();

        System.out.print("Write the number c : ");
        c = value1.nextInt();


        if (a>b && a>c){
            if (b>c){
                System.out.print("Numbers from largest to smallest : " + a +"," + b +"," + c);
            }else
                System.out.print("Numbers from largest to smallest : " + a +"," + c +"," + b);
        }else if (b>a && b>c){
            if(a>c){
                System.out.print("Numbers from largest to smallest : " + b +"," + a +"," + c);
            }else {
                System.out.print("Numbers from largest to smallest : " + b + "," + c + "," + a);
            }
        }else {
            if (a > b) {
                System.out.print("Numbers from largest to smallest : " + c + "," + a + "," + b);
            } else {
                System.out.print("Numbers from largest to smallest : " + c + "," + b + "," + a);
            }
        }


    }
}
