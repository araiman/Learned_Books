package Body5;

import java.lang.Runtime;

/**
 * Created by RyomaArai on 15/05/06.
 */
public class Main2 {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();

        System.out.println("メモリの総容量の限界は" + maxMemory);
        System.out.println("現在のメモリの総容量は" + totalMemory);
        System.out.println("残りのメモリの容量は" + freeMemory);
    }
}
