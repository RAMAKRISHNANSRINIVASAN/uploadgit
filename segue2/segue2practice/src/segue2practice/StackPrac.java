package segue2practice;

import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> sk = new Stack<>();
        sk.push(1);
        sk.push(2);
        sk.push(3);
        sk.push(4);
        sk.push(5);
        
        // Pop and print elements from the stack (LIFO order)
        while (sk.size() > 0) {
            System.out.println(sk.pop());
        }

        // Array of book titles
        String books[] = {"dsa", "c++", "os", "react", "js"};
        
        // Print book titles
     // Create a stack for book titles
        Stack<String> bookStack = new Stack<>();
        for (String book : books) {
            bookStack.push(book);
        }

        // Pop and print the book titles in LIFO order
        while (!bookStack.isEmpty()) {
            System.out.println(bookStack.pop());
        }

    }
}

