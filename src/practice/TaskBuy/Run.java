package practice.TaskBuy;

import lesson.oop.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by userracer on 31.01.2016.
 */
public class Run {
    public static void main(String[] args) {

        List<Usual> listBuy=new ArrayList<>();

        listBuy.add(new Usual(3, 30, 10));
        listBuy.add(new Discount(3, 30, 4, 5));
        listBuy.add(new Fare(3, 30, 9, 10));
        listBuy.add(new Bonus(4, 50, 23, 25));
        listBuy.add(new Usual( 4, 20, 15));
        listBuy.add(new Bonus(15, 280, 30, 200));
        listBuy.add(new Discount(20, 35, 25, 15));
        listBuy.add(new Usual(3, 30, 5));
        listBuy.add(new Discount(3, 30, 8, 5));
        listBuy.add(new Fare(3, 30, 9, 10));
        listBuy.add(new Bonus(4, 50, 28, 25));
        listBuy.add(new Usual(4, 20, 17));
        listBuy.add(new Bonus(15, 280, 30, 200));
        listBuy.add(new Discount(20, 35, 21, 15));

        for(Usual us : listBuy){
            System.out.println(us);
        }

        Collections.sort(listBuy, new Comparator<Usual>() {
            @Override
            public int compare(Usual o1, Usual o2) {

                // TODO можно проще
                return Integer.compare(o1.getDay(),o2.getDay());

//                if(o1.getDay()==o2.getDay())
//                    return 0;
//                if(o1.getDay()>o2.getDay())
//                    return 1;
//                return -1;
            }
        });

        System.out.println("--------------После сортировки--------------");
        // TODO 3 раза используется вывода списка, тогда лучше вынести в отдельную функцию
        for(Usual us : listBuy){
            System.out.println(us);
        }

        Collections.sort(listBuy, new Comparator<Usual>() {
            @Override
            public int compare(Usual o1, Usual o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        System.out.println("--------------После 2 сортировки--------------");
        for(Usual us : listBuy){
            System.out.println(us);
        }
        System.out.println("-------------Существует ли покупка за определенное число-------");
        for(Usual us : listBuy){
            us.SearchDay(10);
        }

    }
}
