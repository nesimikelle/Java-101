import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double math, turkish, history, chemistry, physics, biology;
        double avarage;
        double total;

        Scanner giris = new Scanner(System.in);

        System.out.print("Write your math grade :");
        math = giris.nextDouble();

        System.out.print("Write your turkish grade :");
        turkish = giris.nextDouble();

        System.out.print("Write your history grade :");
        history = giris.nextDouble();

        System.out.print("Write your chemistry grade :");
        chemistry = giris.nextDouble();

        System.out.print("Write your physics grade :");
        physics = giris.nextDouble();

        System.out.print("Write your biology grade :");
        biology = giris.nextDouble();

        total = (math + turkish + history + chemistry + physics + biology);
        avarage = (total/6);

        if (math<0 || math>100 || turkish<0 || turkish>100 || history<0 || history>100 ||
                chemistry<0 || chemistry>100 ||  physics<0 || physics>100 ||  biology<0 || biology>100){
            System.out.print("Please write your exam grades between 0 and 100.");
            }else if (avarage>=55){
            System.out.print("Congratulations! ");
        }else {
            System.out.print("Unsuccessful :( ");
        }


    }
}
