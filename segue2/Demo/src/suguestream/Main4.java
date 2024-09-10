package suguestream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {
        // List of monthly salaries
        List<Integer> emp = new ArrayList<>();
        emp.add(3000000);
        emp.add(4000);
        emp.add(2000);
        emp.add(6000);

        // Convert monthly salaries to yearly salaries by multiplying each by 12
        List<Integer> yearlySalaries = emp.stream()
                                          .map((t) -> t * 12)  // Map each monthly salary to yearly salary
                                          .collect(Collectors.toList());  //*NOTE// Collect the results into a list

        // Print the list of yearly salaries
        System.out.println(yearlySalaries);
    }
}

