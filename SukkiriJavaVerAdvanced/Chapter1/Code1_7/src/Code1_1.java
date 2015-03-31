/**
 * Created by RyomaArai on 15/03/04.
 */
public class Code1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 100; i++){
            sb.append(i+1).append(",");
        }

        String s = sb.toString();
        String[] a = s.split(",");


    }
}
