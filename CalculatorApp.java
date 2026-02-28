import java.util.Scanner;

public class CalculatorApp {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN;
        }
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot calculate square root of negative number");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public static double log10(double a) {
        if (a <= 0) {
            System.out.println("Error: Logarithm undefined for zero or negative numbers");
            return Double.NaN;
        }
        return Math.log10(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modulus");
        System.out.println("6 - Power");
        System.out.println("7 - Square Root");
        System.out.println("8 - Log10");

        int choice = sc.nextInt();
        double result;

       
        if (choice != 7 && choice != 8) {

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                case 5:
                    result = modulus(num1, num2);
                    break;
                case 6:
                    result = power(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice");
                    sc.close();
                    return;
            }

        } else { 

            System.out.print("Enter the number: ");
            double num1 = sc.nextDouble();

            switch (choice) {
                case 7:
                    result = squareRoot(num1);
                    break;
                case 8:
                    result = log10(num1);
                    break;
                default:
                    System.out.println("Invalid choice");
                    sc.close();
                    return;
            }
        }

        if (!Double.isNaN(result)) {
            System.out.println("Result = " + result);
        }

        sc.close();
    }
}