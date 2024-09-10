package suguestream;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        
        List<String> users = new ArrayList<>();
        
        
        users.add("Asha sharma");
        users.add("Pooja gupta");
        users.add("Kavita gupta");
        users.add("Ajay sharma");
        users.add("Deepa sharma");

       
        long count = users.stream()
                          .filter((temp) -> temp.toLowerCase().contains("sharma"))
                          .count();//*NOTE here count is returning long 
        
        System.out.println("Number of users with 'sharma' in the name: " + count);
        
        
        users.stream()
             .filter((temp) -> temp.toLowerCase().contains("sharma"))
             .forEach((t)->System.out.println(t)); // Print each name//*NOTE
    }
}

