package segue2practice;

public class Demo {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student(101, "Asha", 300);
        Student s2 = new Student(101, "Pooja", 300);

        // Comparing s1 and s2 using equals() method
        if (s1.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}