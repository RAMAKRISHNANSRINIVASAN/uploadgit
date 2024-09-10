package segue2practice;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee software = new Employee() {
            @Override
            public String getName() {
                return "Ram";
            }
            @Override
            public Double getSal() {
                return 15000.0;
            }
        };        
        System.out.println("Name: " + software.getName());
        System.out.println("Salary: " + software.getSal());
    }
}
