package lesson.Butom;


public class AnonimClass {
    public static void main(String[] args) {
        Printable printable = new PrintImpl();
        printable.print();

        PrintImpl imp = (PrintImpl)printable;
        imp.print();
        imp.print2();
        Printable printable11 = new Printable() {
            @Override
            public void print() {
                System.out.println("in main");
            }
        };

        printable11.print();

        PrintImpl p1 = new PrintImpl();
        PrintImpl p2 = new PrintImpl();
    }

}

interface Printable {
    void print();
}

class PrintImpl implements Printable{

    @Override
    public void print(){
        System.out.println(PrintImpl.class);
    }

    public void print2(){
        System.out.println("print2");
    }
}
