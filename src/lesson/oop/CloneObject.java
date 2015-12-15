package lesson.oop;

public class CloneObject {

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableObject obj1=new CloneableObject(1);
        CloneableObject obj2= (CloneableObject) obj1.clone();
        obj1.a=99;
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class CloneableObject implements Cloneable{
    int a;
    public CloneableObject(int a){
        this.a=a;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "cloneObj{" +
                "a=" + a +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
