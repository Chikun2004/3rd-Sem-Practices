package WrapperClassAssignment;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        String intString = scanner.nextLine();

        // Converting string to int primitive type using parseInt method
        int intValue = Integer.parseInt(intString);

        System.out.println("Int primitive value: " + intValue);

        scanner.close();
    }
}