import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemProperties_09 {
    public static void main(String[] args) {
        Properties systemProperties = System.getProperties();
        Set<Map.Entry<Object,Object>> items = systemProperties.entrySet();
        for (Map.Entry<Object,Object> item: items) {
            System.out.println(item);
            System.out.println();
        }

        Object pwd = System.getProperty("user.dir");

        System.out.println("Current working directory is " + pwd);
    }
}
