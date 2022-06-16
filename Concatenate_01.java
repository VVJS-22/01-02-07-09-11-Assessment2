import java.util.Scanner;

public class Concatenate_01 {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String a = in.next();
            System.out.print("Enter second string: ");
            String b = in.next();
            System.out.println(a + b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
