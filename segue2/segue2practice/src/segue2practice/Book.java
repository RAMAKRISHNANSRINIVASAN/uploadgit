package segue2practice;

public class Book implements Item {
    
    @Override
    public void calBill() {
        System.out.println("Book bill with 5% discount");
    }
}
