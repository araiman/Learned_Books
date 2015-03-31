/**
 * Created by RyomaArai on 15/03/05.
 */
public class Code1_2 {
    public static void main(String[] args) {
        String concatPath(String folder, String file) {
            if (!folder.endsWith("¥¥")) {
                folder += "¥¥";

            }
            return folder + file;
        }
    }
}
