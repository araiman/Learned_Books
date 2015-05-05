package Practice2;

/**
 * Created by RyomaArai on 15/05/05.
 */
public class Main {
    // 関数オブジェクトの受け皿となる、SAM型インターフェースを用意
    interface Func1 {
        abstract boolean call(int x);
    }

    interface Func2 {
        abstract String call(boolean male, String name);
    }

    // 関数の実行
    public static void main(String[] args) {
        Func1 func1 = x -> x % 2 == 1;
        Func2 func2 = (boolean male, String name) -> {
            if (male) {
                return "Mr." + name;
            } else {
                return "Ms." + name;
            }
        };
        System.out.println(func1.call(1));
        System.out.println(func2.call(true, "Smith"));
    }
}
