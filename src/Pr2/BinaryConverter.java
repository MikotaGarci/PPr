public class BinaryConverter {
    public static String toBinaryString(double value) {
        long bits = Double.doubleToRawLongBits(value);
        return Long.toBinaryString(bits);
    }
}