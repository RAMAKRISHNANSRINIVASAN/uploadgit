package suguestream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        // List of integers
        List<Integer> a = new ArrayList<>();
        
        // Adding numbers to the list
        a.add(2);
        a.add(24);
        a.add(22);
        a.add(62);
        a.add(92);
        a.add(92);
        
        // Using stream to filter values greater than 22 and collect them into a list
        List<Integer> filteredList = a.stream()
                                      .filter((t) -> t > 22)  // Filter values greater than 22
                                      .collect(Collectors.toList()); //*NOTE // Collect the result into a List
        
        // Printing the filtered list
        System.out.println("Filtered List (values greater than 22): " + filteredList);
    }
}

