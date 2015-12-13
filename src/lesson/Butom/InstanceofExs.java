package lesson.Butom;

/**
 * Created by User on 06.12.2015.
 */
public class InstanceofExs {

    public static void main(String[] args) {
        Object object1 = new Car(3,"sert");
        Object object2 = "asdr";

        System.out.println(object1 instanceof Car);//проверяет на принадлежность к типу
        System.out.println(object2 instanceof Car);
        if(object1 instanceof Car){
            Car car=(Car)object1;
        }
        Car car = (Car)object1;
        System.out.println(car.id);
    }
}
