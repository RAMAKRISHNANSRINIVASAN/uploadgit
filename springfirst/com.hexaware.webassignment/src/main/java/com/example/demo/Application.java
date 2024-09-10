package com.example.demo;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.BannkAccRepo.BankAccountRepository;
import com.example.demo.Entities.BankAccount;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        BankAccountRepository rep = context.getBean(BankAccountRepository.class);
        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;

        while (running) {

            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Search by Account Number");
            System.out.println("5. Transfer Amount");
            System.out.println("6. Close Account");
            System.out.println("7. Exit");
            System.out.print("Select an option (1-7): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    openAccount(rep, scanner);
                    break;
                case 2:
                    deposit(rep, scanner);
                    break;
                case 3:
                    withdraw(rep, scanner);
                    break;
                case 4:
                    searchByAccountNumber(rep, scanner);
                    break;
                case 5:
                    transferAmount(rep, scanner);
                    break;
                case 6:
                    closeAccount(rep, scanner);
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting application.");
                    break;
                default:
              System.out.println("Invalid choice. Please select a number between 1 and 7.");
            }
        }

        scanner.close();
    }

 // Method to open an account
    private static void openAccount(BankAccountRepository rep, Scanner scanner) {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter account name: ");
        String name = scanner.next();
        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter account email: ");
        String email = scanner.next();

        if (balance > 1000) {
            BankAccount account = new BankAccount();
            account.setAccountNumber(accountNumber);
            account.setName(name);
            account.setBalance(balance);
            account.setEmail(email);

            rep.save(account);
            System.out.println("Account opened successfully.");
        } else {
            System.out.println("Account balance must be above 1000 to open an account.");
        }
    }

    // Method to deposit amount
    private static void deposit(BankAccountRepository rep, Scanner scanner) {
        System.out.print("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();

        Optional<BankAccount> ba = rep.findById(accountNumber);

        if (ba.isPresent()) {
            BankAccount account = ba.get();
            account.setBalance(account.getBalance() + depositAmount);
            rep.save(account);
            System.out.println("Amount deposited successfully. New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw amount
    private static void withdraw(BankAccountRepository rep, Scanner scanner) {
        System.out.print("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        Optional<BankAccount> ba = rep.findById(accountNumber);

        if (ba.isPresent()) {
            BankAccount account = ba.get();

            if (account.getBalance() >= withdrawAmount) {
                account.setBalance(account.getBalance() - withdrawAmount);
                rep.save(account);
                System.out.println("Amount withdrawn successfully. New balance: " + account.getBalance());
            } else {
                System.out.println("Insufficient balance. Current balance: " + account.getBalance());
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to search by account number
    private static void searchByAccountNumber(BankAccountRepository rep, Scanner scanner) {
        System.out.print("Enter the account number to search: ");
        int accountNumber = scanner.nextInt();

        Optional<BankAccount> ba = rep.findById(accountNumber);

        if (ba.isPresent()) {
            BankAccount account = ba.get();
            System.out.println("Account found:");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Name: " + account.getName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Email: " + account.getEmail());
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to transfer amount
    private static void transferAmount(BankAccountRepository rep, Scanner scanner) {
        System.out.print("Enter the source account number: ");
        int sourceAccountNumber = scanner.nextInt();
        System.out.print("Enter the target account number: ");
        int targetAccountNumber = scanner.nextInt();
        System.out.print("Enter the amount to transfer: ");
        double transferAmount = scanner.nextDouble();
        Optional<BankAccount> sourceAccountOpt = rep.findById(sourceAccountNumber);
        Optional<BankAccount> targetAccountOpt = rep.findById(targetAccountNumber);
        if (sourceAccountOpt.isPresent() && targetAccountOpt.isPresent()) {
            BankAccount sourceAccount = sourceAccountOpt.get();
            BankAccount targetAccount = targetAccountOpt.get();
            
            if (sourceAccount.getBalance() >= transferAmount) {
                sourceAccount.setBalance(sourceAccount.getBalance() - transferAmount);
                targetAccount.setBalance(targetAccount.getBalance() + transferAmount);
                rep.save(sourceAccount);
                rep.save(targetAccount);
                System.out.println("Amount transferred successfully.");
                System.out.println("New balance in source account: " + sourceAccount.getBalance());
                System.out.println("New balance in target account: " + targetAccount.getBalance());
            } else {
                System.out.println("Insufficient balance in the source account. Current balance: " + sourceAccount.getBalance());
            }
        } else {
            if (!sourceAccountOpt.isPresent()) {
                System.out.println("Source account not found.");
            }
            if (!targetAccountOpt.isPresent()) {
                System.out.println("Target account not found.");
            }
        }
    }
    // Method to close an account
    private static void closeAccount(BankAccountRepository rep, Scanner scanner) {
        System.out.print("Enter the account number to close: ");
        int accountNumber = scanner.nextInt();
        Optional<BankAccount> ba = rep.findById(accountNumber);
        if (ba.isPresent()) {
            rep.deleteById(accountNumber);
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
}
