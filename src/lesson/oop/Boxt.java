package lesson.oop;

/**
 * Created by User on 04.10.2015.
 */
public class Boxt {
    public static void main(String[] args) {

        try {
            int t;
            Box b = new Box(100);
            System.out.println(b.getT());
            b.setT(500);
            Box bb = new Box(-100);
            bb.setT(-500);
        } catch (IllegalArgumentException e) {
            System.out.println("Было введено значение<0");



        }

    }
}

class Box {
    private int t;

    public Box(int t) {
        setT(t);
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        if(t<0)
            throw new IllegalArgumentException("<0");

        this.t = t;
    }
}