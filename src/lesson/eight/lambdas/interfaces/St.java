package lesson.eight.lambdas.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by igor on 10.02.2016.
 */
public class St {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("7");
        list.add("3");
        list.add("5");
        list.add("1");

        int sum = list.stream().map(Integer::parseInt).reduce((x,y)->x+y).get();


        System.out.println(sum);
    }


}

