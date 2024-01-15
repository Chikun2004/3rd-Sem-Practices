package BitwiseOperatorAssignment;

public class Q4 {
    public static long reverseBits(long number) {
        long reversed = 0;
        for (int i = 0; i < 64; i++) {
            // Shift the reversed number to the left and OR it with the LSB of the input number
            reversed = (reversed << 1) | (number & 1);
            // Right shift the input number to consider the next bit
            number >>= 1;
        }
        return reversed;
    }

    public static void main(String[] args) {
        long input = 0b1010101010101010L; // You can change this value to test different 64-bit words
        System.out.println("Input:  " + Long.toBinaryString(input));
        long reversed = reverseBits(input);
        System.out.println("Output: " + Long.toBinaryString(reversed));
    }
}
