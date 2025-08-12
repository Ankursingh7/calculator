import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value:");
        int a = sc.nextInt();

        System.out.println("Enter the second value:");
        int b = sc.nextInt();

        System.out.println("Enter the operator (+ - * /):");
        char c = sc.next().charAt(0);  // read first char of input

        if (c == '+') {
            System.out.println("Result: " + (a + b));
        } else if (c == '-') {
            System.out.println("Result: " + (a - b));
        } else if (c == '*') {
            System.out.println("Result: " + (a * b));
        } else if (c == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}