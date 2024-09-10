package segue2practice;
//import segue2practice.Sim2;
public class Sim2Main {
    public static void main(String[] args) {
        
        Sim2 vodafone = (noOfCal) -> noOfCal * 5;

       
        Sim2 airtel = (noOfCal) -> noOfCal * 2;
        
        double vodafoneBill = vodafone.calBill(20);
        System.out.println("Vodafone Bill for " + vodafoneBill);

        
        double airtelBill = airtel.calBill(10);
        System.out.println("Airtel Bill for " + airtelBill);
    }
}

