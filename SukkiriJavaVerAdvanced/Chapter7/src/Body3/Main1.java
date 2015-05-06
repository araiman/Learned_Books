package Body3;

/**
 * Created by RyomaArai on 15/05/05.
 */

// Javaから、Mac内のPagesを動かすプログラム
public class Main1 {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("/Applications/Pages.app/Contents/MacOS/Pages");
        pb.start();
    }
}
