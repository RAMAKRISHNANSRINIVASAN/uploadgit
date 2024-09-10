package segue2practice;

abstract class Sim {
    int noOfCalls;
    int noOfMessages;
    int bill;

    
    public Sim(int noOfCalls, int noOfMessages, int bill) {
        this.noOfCalls = noOfCalls;
        this.noOfMessages = noOfMessages;
        this.bill = bill;
    }

    
    abstract void calling();
    abstract void msg();

    
    void show() {
        System.out.println("Bill: " + bill);
    }
}
