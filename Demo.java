// ...existing code...
import java.util.Scanner;

class Calculator {
    // add two integers
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Demo extends Calculator {

    public static void main(String[] args) {
        Demo calc = new Demo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter One Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum: " + calc.add(num1, num2));
        System.out.println("Sum 2: " + calc.add(2, 3,5));
        System.out.println("Difference: " + calc.subtract(num1, num2));
        System.out.println("Product: " + calc.multiply(num1, num2));

        sc.close();
    }
}
// ...existing code...