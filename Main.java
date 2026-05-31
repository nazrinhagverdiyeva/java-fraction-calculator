import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // First task: simple numeric input
        System.out.println("For the first task input 4 number: ");
        int a1 = scanner.nextInt(); int b1 = scanner.nextInt();
        int c1 = scanner.nextInt(); int d1 = scanner.nextInt();

        FractionUtil.CommonFraction(a1, b1, c1, d1);
        FractionUtil.CommonFractionSubs(a1, b1, c1, d1);

        System.out.println();

        // Second task: inputs including mathematical symbols
        System.out.println("For the second task, input the first sign: ");
        String s1 = scanner.next();
        System.out.println("Enter the first two numbers: ");
        int a = scanner.nextInt();  int b = scanner.nextInt();

        System.out.println("Enter the second sign: ");
        String s2 = scanner.next();
        System.out.println("Enter the last two numbers: ");
        int c = scanner.nextInt();  int d = scanner.nextInt();

        // Process complex fraction calculation
        FractionUtil.CommonFractionSign(a, b, c, d, s1, s2);
    }
}
