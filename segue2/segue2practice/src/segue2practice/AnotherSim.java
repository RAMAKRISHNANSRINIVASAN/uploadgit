package segue2practice;

class AnotherSim extends Sim {

    
    public AnotherSim(int noOfCalls, int noOfMessages, int bill) {
        super(noOfCalls, noOfMessages, bill);
    }

    
    @Override
    void calling() {
        System.out.println("AnotherSim: Making " + noOfCalls + " calls.");
    }

    
    @Override
    void msg() {
        System.out.println("AnotherSim: Sending " + noOfMessages + " messages.");
    }
}

