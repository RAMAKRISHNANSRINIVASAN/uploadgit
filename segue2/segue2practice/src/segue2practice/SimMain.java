package segue2practice;

public class SimMain {
    public static void main(String[] args) {
        
        Sim sim1 = new MobileSim(100, 50, 200);

       
        sim1.calling();
        sim1.msg();
        sim1.show(); 
        
        Sim sim2 = new AnotherSim(150, 70, 300);
        sim2.calling();
        sim2.msg();
        sim2.show();
    }
}
