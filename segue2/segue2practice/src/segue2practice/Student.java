package segue2practice;

class Student {
    int roll;
    String name;
    double fee;

    // Constructor
    Student(int roll, String name, int fee) {
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }

//    public Student(int roll2, String name2, double fee2) {
//		// TODO Auto-generated constructor stub
//    	this.roll = roll2;
//        this.name = name2;
//        this.fee = fee2;
//	}

	// Override the equals method
    @Override
    public boolean equals(Object obj) {
        // Check if obj is an instance of Student
        if (obj instanceof Student) {
            Student s2 = (Student) obj;
            // Compare roll and fee
            return this.roll == s2.roll && this.fee == s2.fee;
        }
        return false;
    }
}