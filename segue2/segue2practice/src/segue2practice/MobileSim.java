package segue2practice;

class MobileSim extends Sim {

    
    public MobileSim(int noOfCalls, int noOfMessages, int bill) {
        super(noOfCalls, noOfMessages, bill);
    }

    
    @Override
    void calling() {
        System.out.println("Calling with " + noOfCalls + " calls.");
    }

    
    @Override
    void msg() {
        System.out.println("Messaging with " + noOfMessages + " messages.");
    }
}
