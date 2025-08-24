// Problem-1.java
import java.util.Scanner;

class Calculator {
    double a, b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculate(String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero not allowed!");
                }
            default:
                throw new IllegalArgumentException("Invalid operation!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();

        Calculator calc = new Calculator(a, b);
        System.out.println("Result: " + calc.calculate(op));

        sc.close();
    }
}
