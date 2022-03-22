import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int select;
        while (right > 0) {
            System.out.print("Plase write your username :");
            userName = input.nextLine();
            System.out.print("Plase write your password :");
            password = input.nextLine();

            if (userName.equals("test") && password.equals("123")) {
                System.out.println("Hello, Welcome to Hell Bank!");
                do {
                    System.out.println("1-Deposit money\n" +
                            "2-Withdraw money\n" +
                            "3-Money Balance Inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select you want to do:");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Money Balance : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Money Balance : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient money balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Money Balance : " + balance);
                    }
                } while (select != 4);
                System.out.println("Bye. See you later");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your right to make mistakes : " + right);
                }
            }
        }

    }
}
