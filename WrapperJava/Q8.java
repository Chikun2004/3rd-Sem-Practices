package WrapperClassAssignment;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean as a string (true/false): ");
        String inputString = scanner.nextLine();

        // Converting string to Boolean object using valueOf method
        Boolean booleanObject = Boolean.valueOf(inputString);

        System.out.println("Boolean object value: " + booleanObject);

        scanner.close();
    }
}
