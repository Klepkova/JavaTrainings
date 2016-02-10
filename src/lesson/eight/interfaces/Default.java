package lesson.eight.interfaces;

public class Default {


}

interface A{
    void m1();
    default void m2() {

    }

}

class AImpl implements A {

    @Override
    public void m1() {

    }
}