package lesson.Butom;

/**
 * Created by User on 06.12.2015.
 */
public class Test {
    public static void main(String[] args) {
        Sub s= new Sub();
        Base b = s;
        System.out.println(b.getName());
    }
}

class Base{
    public String name="Base";
    public String getName(){
        return name;
    }
}

class Sub extends Base{
    public String name="Sub";
    public String getName(){
        return name;
    }
}
