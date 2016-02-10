package lesson.eight.lambdas.interfaces;

/**
 * Created by igor on 10.02.2016.
 */
public class Delegates {

    public static void Do(F f, String msg) {
        f.print(msg);
    }

    public static void ff(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.printf("");

        Do(new F() {
            @Override
            public void print(String ff) {
                System.out.println(ff);
            }
        },"hello");


        Do(System.out::println,"hello java8");
        Do(Delegates::ff,"hello 2");
    }
}

interface F {
    void print(String ff);
}