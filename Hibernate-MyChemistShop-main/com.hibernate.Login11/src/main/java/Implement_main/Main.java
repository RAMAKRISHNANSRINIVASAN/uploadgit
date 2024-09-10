package Implement_main;



import java.util.Scanner;
import service.Service;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();

        while (true) {
            System.out.println("1. Sign In");
            System.out.println("2. Sign Up");
            System.out.println("3. Remove Account");
            System.out.println("4. Update Password");
            System.out.println("0. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.signIn();
                    break;
                case 2:
                    service.signUp();
                    break;
                case 3:
                    service.removeAccount();
                    break;
                case 4:
                    service.updatePassword();
                    break;
                case 0:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}

