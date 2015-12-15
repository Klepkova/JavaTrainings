package lesson.oop;


public class Boxing {

    public static void method(int a){}
    public static void method2(Integer a){}
    public static void main(String[] args) {
        int a=123;
        Integer b=34;

//        long start=System.currentTimeMillis();
//        for(int i=0;i<1000000;i++){
//            method(i);
//        }
//        long end=System.currentTimeMillis();
//        System.out.println(end-start);


        long start=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            method2(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
