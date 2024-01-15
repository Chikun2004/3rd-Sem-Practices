package WrapperClassAssignment;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading int as a string and converting to Integer object
        System.out.print("Enter an integer as a string: ");
        String intString = scanner.nextLine();
        Integer intObject = Integer.valueOf(intString);
        System.out.println("Integer object value: " + intObject);

        // Reading float as a string and converting to Float object
        System.out.print("Enter a float as a string: ");
        String floatString = scanner.nextLine();
        Float floatObject = Float.valueOf(floatString);
        System.out.println("Float object value: " + floatObject);

        // Reading double as a string and converting to Double object
        System.out.print("Enter a double as a string: ");
        String doubleString = scanner.nextLine();
        Double doubleObject = Double.valueOf(doubleString);
        System.out.println("Double object value: " + doubleObject);

        // Reading boolean as a string and converting to Boolean object
        System.out.print("Enter a boolean as a string (true/false): ");
        String booleanString = scanner.nextLine();
        Boolean booleanObject = Boolean.valueOf(booleanString);
        System.out.println("Boolean object value: " + booleanObject);

        scanner.close();
    }
}
