package BitwiseOperatorAssignment;

public class Q5 {
    public static int multiply(int x, int y) {
        int result = 0;
        while (y != 0) {
            // If the least significant bit of y is 1, add x to result
            if ((y & 1) == 1) {
                result = add(result, x);
            }
            // Shift x to the left and y to the right
            x <<= 1;
            y >>= 1;
        }
        return result;
    }

    public static int add(int a, int b) {
        int carry;
        while (b != 0) {
            // Carry holds common set bits of a and b
            carry = a & b;
            // Sum of bits of a and b where at least one bit is not set
            a = a ^ b;
            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int result = multiply(x, y);
        System.out.println(x + " * " + y + " = " + result);
    }
}
