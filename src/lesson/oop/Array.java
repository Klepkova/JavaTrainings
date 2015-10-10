package lesson.oop;


public class Array {


    public static void main(String[] args) {

   Point2D point2d=new Point2D(1, 4);
        point2d.f2();
        PointID pointId=new PointID(6);
        System.out.println(point2d);
        System.out.println(pointId);
    }
}

class PointID{
   protected int x=245;
    public void func(){
        System.out.println(x);
    }

    PointID(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "PointID{" +
                "x=" + x +
                '}';
    }

    public void print(){
        System.out.println("1d");
    }
}

class Point2D extends PointID{
    private int y;

    Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public void f2(){
            func();
           // x=34;

        }

    @Override
    public String toString() {
        return "Point2D{" +
                "y=" + y +
                '}';
    }

    public void print(){
        System.out.println("2d");
    }
}