package segue2practice;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array of object
		
	  
		Bank users[]=new Bank[100];
		int c=0;
		Scanner sc = new Scanner(System.in);
 
		
		while(true)
		{
		
		System.out.println("1......New Customer");
		System.out.println("2......show all ");
		System.out.println("3.......Deposit Amout");
		System.out.println("4.......Widthdraw ");
		System.out.println("5 Transfer Amount");
		System.out.println("6.search by account number");
		System.out.println("7.....remove");
		System.out.println("8.....exit");
		int ch=sc.nextInt();
		if (ch == 1) {
            boolean already_exist = false;
            //System.out.println("Enter Account Number:");
            //int actNo1 = sc.nextInt();
            
            // Check if account number already exists
//            for (int i = 0; i < c; i++) {
//                if (users[i].getActNo() == actNo1) {
//                	already_exist = true;
//                    break;
//                }
//            }

            //if (already_exist) {
             //   System.out.println("Account number already holded by another person");
            //} else {
                users[c] = new Bank();
                System.out.println("Enter Name:");
                sc.nextLine(); // Consume newline
                String name1 = sc.nextLine();
                System.out.println("Enter Balance:");
                double balance1 = sc.nextDouble();
                //users[c].setActNo(actNo1);
                users[c].setName(name1);
                users[c].setBalance(balance1);
                c++;
            //}
            
		}
		else if(ch==2)
		{
			
			for(int i=0;i<c;i++)
			{
				System.out.println(users[i].toString()); 
			}
		}
		else if(ch==3)
		{
			boolean flag=true;
        	System.out.println("enter Account Nnumber");
			    int ActNo1=sc.nextInt(); 
			 int i;
		 for( i=0;i<c;i++)
		 {
			 if(users[i].getActNo()==ActNo1)
			 {
				flag=false; 
				break;
			 }
		 }
		 if(flag==true) {
			 System.out.println("not found");
			 
		 }
		 else {
			 System.out.println("Enter Amount");
			 Double deposit = sc.nextDouble();
		     Double balance1 = users[i].getBalance() + deposit;
				users[i].setBalance(balance1);
				System.out.println("Balance updated");
		}
			
		}
		else if(ch==4)
		{
			
		}
		else if(ch == 5) {
		    int pos1 = -1, pos2 = -1;

		    // Input two account numbers for the transfer
		    System.out.println("Enter the account number to transfer from:");
		    int act1 = sc.nextInt(); // Account number to transfer from
		    System.out.println("Enter the account number to transfer to:");
		    int act2 = sc.nextInt(); // Account number to transfer to

		    // Search for the accounts in the users array
		    for (int i = 0; i < c; i++) {
		        if (users[i].getActNo() == act1) {
		            pos1 = i; // Sender's account position
		        }
		        if (users[i].getActNo() == act2) {
		            pos2 = i; // Receiver's account position
		        }
		    }

		    // Check if both account numbers are valid
		    if (pos1 == -1 || pos2 == -1) {
		        System.out.println("One or both account numbers not found.");
		    } else {
		        // Both accounts are found, proceed with the transfer
		        System.out.println("Enter the amount to transfer:");
		        double amt = sc.nextDouble(); // Amount to transfer

		        // Get the balances of both accounts
		        double ta1 = users[pos1].getBalance(); // Sender's balance
		        double ta2 = users[pos2].getBalance(); // Receiver's balance

		        // Check if the sender has enough balance for the transfer
		        if (ta1 >= amt) {
		            // Deduct the amount from the sender's account
		            users[pos1].setBalance(ta1 - amt);
		            // Add the amount to the receiver's account
		            users[pos2].setBalance(ta2 + amt);

		            System.out.println("Transfer successful!");
		            System.out.println("New balance of sender: " + users[pos1].getBalance());
		            System.out.println("New balance of receiver: " + users[pos2].getBalance());
		        } else {
		            System.out.println("Insufficient balance for the transfer.");
		        }
		    }
		}

		else if(ch==6)
		{
			boolean account_details = true;
            System.out.println("Enter Account Number:");
            int actNo1 = sc.nextInt();
            int i;
            for (i = 0; i < c; i++) {
                if (users[i].getActNo() == actNo1) {
                	account_details = false;
                    break;
                }
            }
            if (account_details == false) {
            	System.out.println(users[i].toString());
            	
            }
            else {
            	System.out.println("Not found");           
         }
		}
		else if (ch == 7) { // Assuming "7" for the remove customer option
		    System.out.println("Enter the account number to remove:");
		    int ac = sc.nextInt();
		    boolean flag = false;
		    int pos = -1;

		    // Find the account to remove
		    for (int i = 0; i < c; i++) {
		        if (users[i].getActNo() == ac) {
		            flag = true;
		            pos = i;
		            break; // Exit loop once account is found
		        }
		    }

		    if (flag) {
		        // Shift the elements to "remove" the account
		        for (int j = pos; j < c - 1; j++) {
		            users[j] = users[j + 1];
		        }

		        // Nullify the last element and decrease the counter
		        users[c - 1] = null;
		        c--;

		        System.out.println("Account removed successfully.");
		    } else {
		        System.out.println("Account not found.");
		    }
		}
		
		else
		{
			
			break;
		}
		}
	}
}
