package segue2practice;
import segue2practice.Calculate; 
class FuncInterMain {
    public static void main(String[] args) {
        
        Calculate sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.operate(10, 30));

        
        Calculate sub = (a, b) -> a - b;
        System.out.println("Subtraction: " + sub.operate(1, 5));
    }
}
