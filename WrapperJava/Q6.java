package WrapperClassAssignment;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number as a string: ");
        String inputString = scanner.nextLine();

        // Converting string to Float object using parseFloat method
        Float floatObject = Float.parseFloat(inputString);

        System.out.println("Float object value: " + floatObject);

        scanner.close();
    }
}
