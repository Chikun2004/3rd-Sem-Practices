package WrapperClassAssignment;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double as a string: ");
        String inputString = scanner.nextLine();

        // Converting string to Double object using parseDouble method
        Double doubleObject = Double.parseDouble(inputString);

        System.out.println("Double object value: " + doubleObject);

        scanner.close();
    }
}
