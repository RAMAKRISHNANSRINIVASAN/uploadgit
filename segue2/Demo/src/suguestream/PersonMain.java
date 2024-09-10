package suguestream;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ronaldo", 30, "New York"));
        people.add(new Person("Messi", 24, "Los Angeles"));
        people.add(new Person("Ramos", 28, "New York"));
        people.add(new Person("Bale", 35, "Chicago"));
        people.add(new Person("Neymar", 22, "Los Angeles"));

        System.out.println("Task 1: Print the names of all persons in the list.");
        people.stream().map(p -> p.getName()).forEach(name -> System.out.println(name));
        System.out.println("Task 2: Print the names of all persons who are older than 25 years.");
        people.stream().filter(p -> p.getAge() > 25) .map(p -> p.getName()).forEach(name -> System.out.println(name));
        System.out.println("Task 3: Create a new list of names of all persons who live in a specific city (e.g., \"New York\").");
        List<String> newYorkers = people.stream()
                .filter(p -> p.getCity().equals("New York"))
                .map(person -> person.getName())
                .collect(Collectors.toList()); 
        newYorkers.forEach(ny -> System.out.println(ny));
        System.out.println("Task 4: Create a new list of ages of all persons, but only include those who are above 30 years old.");
        List<Integer> agesAbove30 = people.stream()
                .filter(person -> person.getAge() > 30)
                .map(person -> person.getAge())
                .collect(Collectors.toList());  
        agesAbove30.forEach(age -> System.out.println(age));
        System.out.println("Task Sorting");
        List<Person> sortedByAge = people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .collect(Collectors.toList());
        sortedByAge.forEach(person -> System.out.println(person));
        
        System.out.println("Task 7: Compute the average age of all persons in the list.");
        double averageAge = people.stream()
                .mapToInt(person -> person.getAge())
                .average()
                .orElse(0);
        System.out.println("The average age of all persons is: " + averageAge);
        
        System.out.println("Task 8: Find the maximum and minimum age among the persons.");
        OptionalInt maxAge = people.stream()
                .mapToInt(person -> person.getAge())
                .max();
        OptionalInt minAge = people.stream()
                .mapToInt(person -> person.getAge())
                .min();
System.out.println("Maximum age: " + maxAge.getAsInt()); 
System.out.println("Minimum age: " + minAge.getAsInt()); 

//System.out.println("Task 9");
//people.stream()
//.collect(Collectors.groupingBy(person -> person.getCity()))
//.forEach((city, persons) -> {
//    System.out.println(city + ":");
//    persons.forEach(person -> System.out.println(person));
//});
//
//System.out.println("Task 10");
//List<String> uniqueCities = people.stream()
//.map(person -> person.getCity())
//.distinct()
//.toList();  // or collect(Collectors.toList())
//System.out.println("Task 11");
//String allNames = people.stream()
//.map(person -> person.getName())
//.collect(Collectors.joining(", "));

        


        
        
        
        
        
        
        
        
        
        
    }
}

