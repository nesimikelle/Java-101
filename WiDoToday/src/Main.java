import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        int temperature;

        Scanner value1 = new Scanner(System.in);

        System.out.print("welcome to what should i do today program!\nPlease write the air temperature :");
        temperature = value1.nextInt();

        boolean wsido = temperature <= 5;
        boolean wsido1 = temperature <= 15;
        boolean wsido2 = temperature <= 25;

        if (wsido){
            System.out.print("You should go skiing today.");
        }else{
            if (wsido1) {
                System.out.print("You should go cinema today.");
            }else {
                if (wsido2) {
                    System.out.print("You should go picnic today.");
                }else {
                    System.out.print("You should go swim today.");
                }
            }
        }

    }
}
