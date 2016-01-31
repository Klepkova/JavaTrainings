package lesson.oop;

import java.awt.*;

/**
 * Created by User on 20.09.2015.
 */
public class classbegin {

    public static void main(String[] args) {
       Myclass ee = new Myclass();
        ee.a=77777;
        System.out.println(ee.a);
        System.out.println(ee.s);
        System.out.println(ee.c);




        MyCar pp=new MyCar(220, Color.red, "mazda", 5);
        MyCar nn=new MyCar();
        MyCar cc=pp;


        pp.show();
    }
}

    class Myclass{
        int a;
        String s;
        float c;

        public Myclass(){
            a=325;
            s="abx";
            c=12.5f;
        }
        public Myclass(int a, String s, float c){
            this.a=a;
            this.c=c;
            this.s=s;
        }
    }

class MyCar{

        private float maxSpeed;
        private Color coler;
        private String name;
        private int countDoor;

    public MyCar(){
      maxSpeed=320;
      coler=Color.yellow;
      name="Nissan";
      countDoor=5;

    }

    public MyCar(float  maxSpeed, Color coler, String name, int countDoor){
        this.maxSpeed=maxSpeed;
        this.coler=coler;
        this.name=name;
        this.countDoor=countDoor;

    }
 public void show(){
     System.out.printf("%f, %s, %s, %d\n", maxSpeed, coler, name,countDoor);
 }

    public void setMaxSpeed(float maxSpeed) {


        this.maxSpeed = maxSpeed;
    }

    public void setColer(Color coler) {
        this.coler = coler;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountDoor(int countDoor) {
        this.countDoor = countDoor;
    }

    public float getMaxSpeed() {
        if(maxSpeed<0)
        {System.out.println("Недопустимая скорость");}

        return maxSpeed;
    }

    public Color getColer() {
        return coler;
    }

    public String getName() {
        return name;
    }

    public int getCountDoor() {
        if(countDoor>1){
        return countDoor;}
        else{System.out.println("Недопустимо");
        }

        return 0;
    }
    public boolean equals(Object obj){
        if(obj instanceof  MyCar){
        MyCar pp=(MyCar)obj;
        this.name.equals(pp.name);}
        return false;
    }
}

