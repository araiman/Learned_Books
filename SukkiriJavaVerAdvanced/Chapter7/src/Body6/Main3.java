package Body6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by RyomaArai on 15/05/06.
 */
public class Main3 {
    public static void main(String[] args) throws Exception {
        Class clazz = RefSample.class;
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        Constructor<?> constructor = clazz.getConstructor(int.class);
        System.out.println(constructor);

        RefSample rs = (RefSample) constructor.newInstance(256);

        // pubフィールドに関するFieldを取得して読み書き
        Field f = clazz.getField("times");
        System.out.println(f.get(rs));
        f.set(rs, 2);
        System.out.println(f.get(rs));
    }
}
