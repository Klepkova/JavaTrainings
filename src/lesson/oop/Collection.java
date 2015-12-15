package lesson.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 29.11.2015.
 */
public class Collection {
    private static void print(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(1);
//        list.add(2);
//        list.add(7);
//        list.add(11);
//        list.add(5);
//
//
//        List<String> stlist = new ArrayList<>();
//        stlist.add("wer");
//        stlist.add("wer");
//        stlist.add("wer");
//
//       print(stlist);
//
//        Collections.sort(list);
//
//        print(list);
        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass(9));
        list.add(new MyClass(3));
        list.add(new MyClass(67));
        list.add(new MyClass(65));

        print(list);

        Collections.sort(list, new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
              return Integer.compare(o1.getN(), o2.getN());
            }
        });
        print(list);

        int n=Collections.binarySearch(list,3);
        System.out.println(n);


    }
}


class MyClass implements Comparable<Integer> {
    private int n;

    MyClass(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "n=" + n +
                '}';

    }

    @Override
    public int compareTo(Integer o) {
//        if (this.n == o.n)
//            return 0;
//        if (this.n < o.n)
//            return -1;
//            return 1;
     return Integer.compare(this.n,o);
    }

}