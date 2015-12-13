package lesson.Butom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 06.12.2015.
 */
public class SortWhothComporator {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
       carList.add(new Car(5,"er"));
        carList.add(new Car(2,"dsfer"));
        carList.add(new Car(1,"erdfd"));
        carList.add(new Car(3,"eerfedfr"));


        System.out.println(carList);
        System.out.println("****************");

        Collections.sort(carList, new Comparator<Car>(){
            @Override
        public int compare(Car o1, Car o2){
                return Integer.compare(o1.id, o2.id);
            }
        });

        System.out.println(carList);

    }
}

class Car{
    int id;
    String name;

    Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
