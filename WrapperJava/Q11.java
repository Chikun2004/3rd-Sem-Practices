package WrapperClassAssignment;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double as a string: ");
        String doubleString = scanner.nextLine();

        // Converting string to double primitive type using parseDouble method
        double doubleValue = Double.parseDouble(doubleString);

        System.out.println("Double primitive value: " + doubleValue);

        scanner.close();
    }
}
