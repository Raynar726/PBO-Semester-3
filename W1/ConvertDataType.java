package W1;

public class ConvertDataType {
    static short methodOne(long L) {
        int i = (int) L;
        return (short)i;
    }
    public static void main(String[] args) {
        double d = 10.25;
        float f = (float)d;
        byte b = (byte) methodOne((long)f);
        System.out.println(b);
    }
}