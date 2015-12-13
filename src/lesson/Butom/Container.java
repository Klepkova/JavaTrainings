package lesson.Butom;

import java.util.ArrayList;
import java.util.List;


public class Container {
    public static void main(String[] args) {
        Container container = new Container();
    List<Car> cars = container.filtration(new Predicate() {
        @Override
        public boolean predicate(Object v) {

            Car car =(Car)v;
            return (car.id<5);
        }
    });

        System.out.println(cars);
    }

    List<Car> list = new ArrayList<>();

    Container(){
        list.add(new Car(5,"er"));
        list.add(new Car(2,"dsfer"));
        list.add(new Car(1,"erdfd"));
        list.add(new Car(3,"eerfedfr"));
    }
    public List<Car> filtration(Predicate p ){
        List<Car>  cars = new ArrayList<>();
        for(Car car : list){
            if(p.predicate(car)){
                cars.add(car);
            }
        }
        return cars;
    }
}

interface Predicate<T>{
    boolean predicate(T v);
}
