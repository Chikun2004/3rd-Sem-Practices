package WrapperClassAssignment;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression (+, -, *, /): ");
        String expression = scanner.nextLine();

        char operator = expression.charAt(1);
        String[] operands = expression.split("[\\+\\-\\*/]");

        int num1 = Integer.parseInt(operands[0]);
        int num2 = Integer.parseInt(operands[1]);

        switch (operator) {
            case '+':
                System.out.println("Sum=" + (num1 + num2));
                break;
            case '-':
                System.out.println("Difference=" + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication=" + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Division=" + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}
