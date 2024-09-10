package segue2practice;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueues {
    public static void main(String[] args) {
        int a[] = {4, 6, 17, 8, 9, 3, 24, 6, 7, 2, 23, 14, 5};
        Queue<Integer> q = new PriorityQueue<>();

       
        for (int i : a) {
            q.add(i);
        }

        
        System.out.println("Enter the value of k (to find k-th minimum element):");
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();

        // Check if k is within valid range
        if (k <= 0 || k > a.length) {
            System.out.println("Invalid value of k. Please enter a value between 1 and " + a.length);
        } else {
            // Poll k-1 elements to remove the smallest k-1 elements
            for (int i = 0; i < k - 1; i++) {
                q.poll();
            }

            // Poll the k-th element
            System.out.println("The " + k + "-th minimum element is: " + q.poll());
        }

        // Close the scanner
        s.close();
    }
}