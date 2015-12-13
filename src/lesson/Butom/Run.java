package lesson.Butom;


public class Run {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        ClassOne.InnerClass InnerClass = classOne.new InnerClass();//на базе созданного объекта создаем объект внутреннего класса
        ClassOne.Inner5 staticClass  = new ClassOne.Inner5();

         Storage storage = classOne.getStorage();//????
    }


}

interface Storage {}

class ClassOne{
    private int a=4;
    public Storage getStorage(){

        class InMethodClass{

        }
        return new Inner4();
    }
    public class InnerClass{
   public class InnerInnerClass{
       public  void print(){
           a=8;
       }

   }
    }

    class Inner2{}//Варьирование спецмфмкаторов доступа
    protected class Inner3{}
    private class Inner4 implements Storage {}

    static public class  Inner5{}
    static class Inner6{}
    static protected class Inner7{}
    static private class Inner8{}
}