package lesson.oop;

/**
 * Created by User on 27.09.2015.
 */
public class AbstractClass {
    public static void main(String[] args) {
        Storage storage=new Txt();
        System.out.println(storage.get(0));
    }
}

abstract class Storage{
    abstract  String[]  load();
    String get( int id){
        String [] records=load();
        return records[id];
    }
}

class Txt extends Storage{
    String[] load(){
        System.out.println("Out data from Txt");
        return new String[]{"one","two"};
    }
}

class Binary extends Storage{
    String[] load(){
        System.out.println("Get data from Binary");
        return new String[]{"five", "seven","one"};
    }
}

