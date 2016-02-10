package lesson.eight;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Parameters {

    public void m1( int myname) {
    //TODO -parameters
    }

    public static void main(String[] args) throws NoSuchMethodException {

        Class<Parameters> p = Parameters.class;
        Method m1 = p.getMethod("m1", int.class);

        System.out.println(m1.getParameters()[0].getName());

    }
}
