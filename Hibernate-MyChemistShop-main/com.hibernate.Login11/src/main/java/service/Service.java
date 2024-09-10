package service;



import java.util.Scanner;
import dao.Dao;
import dao.DaoInter;

public class Service {

    private Scanner sc;
    private DaoInter dao;

    public Service() {
        sc = new Scanner(System.in);
        dao = new Dao();
    }

    public void signIn() {
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        System.out.print("Enter Password: ");
        String password = sc.next();
        if (dao.signIn(userId, password)) {
            System.out.println("Sign-In Successful");
        } else {
            System.out.println("Invalid User ID or Password");
        }
    }

    public void signUp() {
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        System.out.print("Enter Password: ");
        String password = sc.next();
        System.out.print("Enter Email: ");
        String email = sc.next();
        if (dao.signUp(userId, password, email)) {
            System.out.println("Sign-Up Successful");
        } else {
            System.out.println("Sign-Up Failed");
        }
    }

    public void removeAccount() {
        System.out.print("Enter User ID to remove: ");
        int userId = sc.nextInt();
        if (dao.removeAccount(userId)) {
            System.out.println("Account Removed Successfully");
        } else {
            System.out.println("Account Not Found");
        }
    }

    public void updatePassword() {
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        System.out.print("Enter New Password: ");
        String newPassword = sc.next();
        if (dao.updatePassword(userId, newPassword)) {
            System.out.println("Password Updated Successfully");
        } else {
            System.out.println("Failed to Update Password");
        }
    }
}
