package LAB1;

public class Main {
    public static int solveImproved(int n) {
        // Base case: if n is 0 or 1, return n directly as Fibonacci(0) = 0 and Fibonacci(1) = 1
        if (n <= 1) {
            return n;
        }
        


        // Create an array to store Fibonacci values for indices from 0 to n
        // We allocate extra space by adding 3 to the array size to accommodate the n+2 index access
        int[] values = new int[n + 3];  
        
         // Initialize the first two Fibonacci numbers
        values[0] = 0;
        values[1] = 1;
        
        // Fill the array using the original relationship
        for (int i = 2; i <= n; i++) {
            values[i] = values[i-1] + values[i+2];
        }
        
        return values[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Results:");
        for (int i = 0; i < n; i++) {
            System.out.println(solveImproved(i) + " ");
        }
    }
}