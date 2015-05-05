import java.util.function.IntBinaryOperator;

public class 6_2 {
    public static int sub(int a, int b) {
        return  a-b;
    }
    public static void main(String[] args) {
        IntBinaryOperator func = 6_2::sub;
    }
}
