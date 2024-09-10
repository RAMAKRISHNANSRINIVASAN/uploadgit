package segue2practice;

public class Bank {
	
	private int ActNo;
	static int c;
	private String Name;
	private Double Balance;
	
	
	 Bank()
	 {
		 c++;
		 ActNo=c;
	
	 }
	
	
	
	public Bank(int actNo, String name, Double balance) {
		super();
		ActNo = actNo;
		Name = name;
		Balance = balance;
	}
	public int getActNo() {
		return ActNo;
	}
	public void setActNo(int actNo) {
		ActNo = actNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
	
	public void deposit(double amount) {
        if (amount > 0) {
            this.Balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
	
	@Override
	public String toString() {
		return "Bank [ActNo=" + ActNo + ", Name=" + Name + ", Balance=" + Balance +"]";
	}
}
