import java.util.Scanner;

public class Addition {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int result = add(num1, num2);
        System.out.println("Sum: " + result);

        sc.close();
    }
}
