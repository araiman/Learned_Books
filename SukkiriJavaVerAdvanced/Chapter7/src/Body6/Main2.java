package Body6;

/**
 * Created by RyomaArai on 15/05/06.
 */
public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> cinfo1 = String.class;
        Class<?> cinfo2 = Class.forName("java.lang.String");
        Class<?> cinfo3 = cinfo1.getClass();

        // FQCNの取得
        System.out.println("FQCNは" + cinfo1.getName());
        System.out.println("FQCNは" + cinfo2.getName());
        System.out.println("FQCNは" + cinfo3.getName());

        // クラス名部分のみ
        System.out.println("SimpleClassNameは" + cinfo1.getSimpleName());

        System.out.println("親クラスは" + cinfo1.getSuperclass());
        System.out.println("属するパッケージは" + cinfo1.getPackage());
  }
}
