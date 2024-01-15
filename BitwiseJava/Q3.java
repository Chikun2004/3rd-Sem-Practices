package BitwiseOperatorAssignment;

public class Q3 {
    public static int swapBits(int number, int i, int j) {
        // Extract the i-th and j-th bits
        int bitI = (number >> i) & 1;
        int bitJ = (number >> j) & 1;

        // If the bits are different, perform the swap
        if (bitI != bitJ) {
            // Create masks to flip the i-th and j-th bits
            int maskI = 1 << i;
            int maskJ = 1 << j;

            // Flip the i-th and j-th bits in the number
            number = number ^ maskI;
            number = number ^ maskJ;
        }

        return number;
    }

    public static void main(String[] args) {
        int num = 28; // You can change this value to test different numbers
        int i = 1;    // i-th bit
        int j = 3;    // j-th bit

        System.out.println("Before swapping: " + Integer.toBinaryString(num));
        int result = swapBits(num, i, j);
        System.out.println("After swapping:  " + Integer.toBinaryString(result));
    }
}
