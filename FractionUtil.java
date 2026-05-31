public class FractionUtil{

    // Task 1: Basic addition of two fractions using cross-multiplication
    public static void CommonFraction(int a1, int b1, int c1, int d1){
        int n = (a1*d1) + (b1*c1);          // Cross-multiplication for numerator
        int m = b1*d1;                      // Common denominator
        System.out.println("The result for addition: ");
        simplify(n, m);
    }

    // Task 1: Basic Subtraction of two fractions
    public static void CommonFractionSubs(int a1, int b1, int c1, int d1){
        int n = (a1*d1) - (b1*c1);          // Cross-multiplication for numerator
        int m = b1*d1;                      // Common denominator
        System.out.println("The result for subtraction: ");
        simplify(n, m);
    }

    // Task 2: Handling fractions with signs (+ or -)
    public static void CommonFractionSign(int a, int b, int c, int d, String s1, String s2){
        int n;
        // Logic to determine numerator based on the combination of signs
        if (s1.equals("-") && s2.equals("+")){
            n = (b*c) - (a*d);
        }
        else if (s1.equals("+") && s2.equals("-")){
            n = (a*d) - (b*c);
        }
        else if (s1.equals("-") && s2.equals("-")){
            n = -((a*d) + (b*c));
        } else{
            n = (a*d) + (b*c);
        }
        int m = b*d;
        simplify(n, m);
    }

    // Method to reduce the fraction to its simplest form
    public static void simplify(int n, int m){
        // Return 0 if numerator is zero
        if (n == 0){
            System.out.println("Output: " + 0 + ", " + 1);
            return;
        }
        //Warnings about denumerator
        if (m == 0){
            System.out.println("Denumerator cannot be zero!");
            return;
        }
        int x1 = n;
        int y1 = m;

        // Use absolute values to calculate the GCD (Greatest Common Divisor)
        int x = Math.abs(n);
        int y = Math.abs(m);

        // Find Greatest Common Divisor (GCD) using Euclidean algorithm
        while (x != y) {
            if (x > y){
                x -= y;
            } else{
                y -= x;
            }
        }
        // Divide both numerator and denominator by GCD
        System.out.println("Output: " + (x1/x) + ", " + (y1/x));
    }
}