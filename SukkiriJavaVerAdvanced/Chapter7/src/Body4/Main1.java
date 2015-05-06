package Body4;

import java.util.Properties;

/**
 * Created by RyomaArai on 15/05/06.
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));

        Properties properties = System.getProperties();
        System.out.println(properties.getProperty("java.home"));
    }
}
