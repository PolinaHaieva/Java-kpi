// This Java code calculates the sum of a series of fractions and prints the result.

public class first {
    public static void main(String[] args) {
        // Initialize variables
        final int a = 0;
        final int b = 0;
        final int n = 0;
        final int m = 4;
        final int C = 1; // Constant value for calculation
        double s = 0; // Variable to store the sum

        // Check for division by zero
        if (a < 2) {
            System.out.println("Division by zero!");
        } else {
            // Iterate through nested loops to calculate sum of fractions
            for (short i = a; i <= n; i++) {
                for (short j = b; j <= m; j++) {
                    // Calculate fraction and add to sum
                    s += (double) (i + j) / (i - C);
                }
            }
            // Print the sum
            System.out.println("S=" + s);
        }
        // Print the result of integer division
        System.out.println(3 / 2);
    }
}
