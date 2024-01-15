package WrapperClassAssignment;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String inputString = scanner.nextLine();

        // Converting string to Integer object using parseInt method
        Integer integerObject = Integer.parseInt(inputString);

        System.out.println("Integer object value: " + integerObject);

        scanner.close();
    }
}
