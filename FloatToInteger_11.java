import java.util.Scanner;

public class FloatToInteger_11 {

    static void floatToInt(Float a) {
        Integer i = a.intValue();

        System.out.println(i);
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a float value: ");
            Float a = in.nextFloat();
            floatToInt(a);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
