package Practice2;

/**
 * Created by RyomaArai on 15/05/05.
 */
public class FuncList {
    public boolean isOdd(int x) {
        return (x % 2 == 1);
    }

    public String addNamePrefix(boolean male, String name) {
        if (male == true) {
            return "Mr" + name;
        } else {
            return "Ms" + name;
        }
    }
}
