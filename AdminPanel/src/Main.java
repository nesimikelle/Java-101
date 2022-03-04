import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        String userName , password , newPassword , wrongPassword;

        Scanner value = new Scanner(System.in);

        System.out.print("Write your username : ");
        userName = value.nextLine();

        System.out.print("Write your password : ");
        password = value.nextLine();

        if (userName.equals("admin") && password.equals("1password1")){
                System.out.print("Login Succesfully!");
        }   else if (!userName.equals("admin"))  {
                System.out.print("Wrong Username");
        }   else if (!password.equals("1password1"))  {
                System.out.println("Wrong Password");
                System.out.print("Do you want to change the password? (y or n) :");

                newPassword = value.nextLine();

                if (newPassword.equals("y")){

                    System.out.print("Please write your new password : ");
                    wrongPassword = value.nextLine();

                    if (wrongPassword.equals("1password1")){
                        System.out.print("Error! Your new password cannot be the same as your old password. ");

                    }else {
                        System.out.println("Successful! Your password has been changed. ");
                    }

                }else if (newPassword.equals("n")){
                    System.out.print("Please try again later.");

                }else {
                    System.out.print("Incorrect operation! Please try again later.");
                }

        }   else {
                System.out.print("NaN");
        }


    }
}
