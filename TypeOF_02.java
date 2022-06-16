import java.util.Scanner;

public class TypeOF_02 {
    public static void main(String[] args) {
        System.out.print("Enter a data: ");
        try (Scanner in = new Scanner(System.in)) {
            String result = "Not Found";
            if (in.hasNextInt()) {
                result = "Integer";
            } else if (in.hasNextLong()) {
                result = "Long";
            } else if (in.hasNextFloat()) {
                result = "Float";
            } else if (in.hasNextDouble()) {
                result = "Double";
            } else if (in.hasNext()) {
                result = "String";
            } else if (in.hasNextBoolean()) {
                result = "Boolean";
            } else if (in.hasNextBigDecimal()) {
                result = "Big Decimal";
            } else if (in.hasNextBigInteger()) {
                result = "Big Integer";
            } else if (in.hasNextByte()) {
                result = "Byte";
            } else if (in.hasNextShort()) {
                result = "Short";
            }

            System.out.println("Type: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
