package segue2practice;

public class ItemMain {
    public static void main(String[] args) {
        
        Item tv = new TV();
        Item book = new Book();

       
        tv.calBill();
        book.calBill();

       
        tv.sale();
        book.sale();
    }
}
