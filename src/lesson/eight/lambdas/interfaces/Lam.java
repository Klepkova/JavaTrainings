package lesson.eight.lambdas.interfaces;

import java.util.Objects;


// ссылки на статик методы
// ссылки на инстанцированные методы
// ссылки на конструкторы
// Collectors

public class Lam {

    public static void d(Object ob) {
        // Objects java7
        Objects.requireNonNull(ob);


        System.out.println("do it !");

    }

    public static void main(String[] args) {
        //new Thread(()->{System.out.print("thread");}).start();
        //Iterable d;
       // d.forEach(); extention methods

        d(null);
    }
}
