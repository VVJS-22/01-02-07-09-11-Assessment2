public class OverrideToString_07 {

    String name;
    int age;

    public OverrideToString_07 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override public String toString() {
        return "Hello " + this.name + " " + this.age;
    }

    public static void main(String[] args) {
        OverrideToString_07 ots = new OverrideToString_07("Jayesh", 22);
        System.out.println(ots);
    }
}
