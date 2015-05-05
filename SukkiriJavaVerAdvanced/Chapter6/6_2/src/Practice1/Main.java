package Practice1;

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
        FuncList funcList = new FuncList();
        Func1 func1 = funcList::isOdd;
        Func2 func2 = funcList::addNamePrefix;
        System.out.println(func1.call(1));
        System.out.println(func2.call(true, "Smith"));
    }
}
