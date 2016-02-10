package lesson.eight.lambdas.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Types {

    public static boolean  iAmPredicate(String str) {
        return str.startsWith("a");
    }

    public static void iAmConsumer(String str){
        System.out.println(str);
    }

    public static int iAmFunction(String str) {
        return str.length();
    }

    public static String iAmSupplier() {
        return "Hello";
    }

    public static void main(String[] args) {
        Predicate<String> predicate = Types::iAmPredicate;
        Consumer<String> consumer = Types::iAmConsumer;
        Function<String, Integer> function = Types::iAmFunction;
        Supplier<String> supplier = Types::iAmSupplier;

        System.out.println(supplier.get());

        System.out.println(function.apply("sdfsf"));

        consumer.accept("wer");

        if(predicate.test("abb")){
            System.out.println("true");
        }

        List<String> rows = new ArrayList<>();
        rows.add("abb");
        rows.add("fdg");
        rows.add("aaa");
        rows.add("ghf");

        rows.stream()
                .filter(predicate)
                .forEach(System.out::println);



    }
}