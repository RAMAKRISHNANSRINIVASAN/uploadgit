package segue2practice;

@FunctionalInterface
public interface Item {
    
    void calBill();

    
    default void sale() {
        System.out.println("Sales 20%");
    }
}
