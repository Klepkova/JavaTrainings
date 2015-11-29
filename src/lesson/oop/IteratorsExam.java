package lesson.oop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 29.11.2015.
 */
public class IteratorsExam {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);

        for(Integer item : list){
            System.out.println(item);
        }

        System.out.println("эквивалентно");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()==true){
            System.out.println(iterator.next());
        }

    }
}