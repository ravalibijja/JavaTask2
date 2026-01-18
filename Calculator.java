import java.util.Scanner;

public class Calculator {

    // static variable (shared by all objects)
    static String appName = "Simple Calculator";

    // instance variable (belongs to object)
    int instanceCount = 1;

    public static void main(String[] args) {

        // local variables (exist only inside main)
        int a, b;
        int sum, diff, product;
        double division;

        // primitive data types with memory info
        byte byteVar = 10;        // 1 byte
        short shortVar = 100;     // 2 bytes
        int intVar = 1000;        // 4 bytes
        long longVar = 10000L;    // 8 bytes
        float floatVar = 10.5f;   // 4 bytes
        double doubleVar = 20.55; // 8 bytes
        char charVar = 'A';       // 2 bytes
        boolean boolVar = true;   // 1 bit

        Scanner sc = new Scanner(System.in);

        System.out.println(appName);

        // user input
        System.out.print("Enter first number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter integers only.");
            return;
        }
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter integers only.");
            return;
        }
        b = sc.nextInt();

        // arithmetic operations
        sum = a + b;
        diff = a - b;
        product = a * b;

        // type casting (int to double)
        division = (double) a / b;

        // formatted output
        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Difference = %d%n", diff);
        System.out.printf("Product = %d%n", product);
        System.out.printf("Division = %.2f%n", division);

        sc.close();
    }
}
