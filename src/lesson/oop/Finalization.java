package lesson.oop;

public class Finalization {
    public static void main(String[] args) {

        TestFinalization obj=new TestFinalization();
        System.out.println("end");
        obj=null;
        System.gc();//можно очистить память
    }
}


class TestFinalization{
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.print("delete object");
    }
}
