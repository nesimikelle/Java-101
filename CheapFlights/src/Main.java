import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int distance ,reTurn ;


        Scanner value1 = new Scanner(System.in);

        System.out.print("Write the distance you will go (km) : ");
        distance = value1.nextInt();
        System.out.print("Choose the type of trip (1. One way , 2.Return) : ");
        reTurn = value1.nextInt();

        if (reTurn==1 || reTurn==2){
            if (reTurn == 1){
                System.out.print("Write your age : ");
                int yas = value1.nextInt();
                if (yas >= 0 && yas <= 12){
                    System.out.println("Total Amount : " + distance*0.05 + "TL");
                }else if (yas > 12 && yas <= 25){
                    System.out.println("Total Amount : " + distance*0.09 + "TL");
                }else if (yas > 25 && yas <= 64){
                    System.out.println("Total Amount : " + distance*0.10 + "TL");
                }else if (yas > 64){
                    System.out.println("Total Amount : " + distance*0.07 + "TL");
                }else {
                    System.out.print("You Entered Wrong Data!");
                }

            }else {
                if (reTurn == 2){
                System.out.print("Write your age : ");
                    int yas = value1.nextInt();
                    if (yas >= 0 && yas <= 12){
                        System.out.println("Total Amount : " + distance*0.04 + "TL");
                    }else if (yas > 12 && yas <= 25){
                        System.out.println("Total Amount : " + distance*0.072 + "TL");
                    }else if (yas > 25 && yas <= 64){
                        System.out.println("Total Amount : " + distance*0.08 + "TL");
                    }else if (yas > 64){
                        System.out.println("Total Amount : " + distance*0.056 + "TL");
                    }else {
                        System.out.print("You Entered Wrong Data!");
                    }

                }else {
                    System.out.print("You Entered Wrong Data!");
                }


            }
        }else {
            System.out.print("You Entered Wrong Data!");
        }


    }
}
