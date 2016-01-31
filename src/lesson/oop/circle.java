package lesson.oop;


public class circle {
    public static void main(String[] args) {

        Circul cc= new Circul();
        Circul cc1= new Circul();
        Circul cc2= new Circul();

        cc.setR(12);
        cc.square();
        cc.show();
        System.out.println(cc.square());
    }


}

class Circul{
    private double r;
    private double s;
    private boolean isChanged;
    public Circul(){
        r=12;
    }

    public Circul(double r)
    {
        isChanged=true;
        this.r=r;
    }

    public double square(){
        if(isChanged)
        {double s;
        s=Math.PI*(r*r);
        isChanged=false;
        }
        return s;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void show(){
        System.out.printf("%d, %d", r, square());
    }

}