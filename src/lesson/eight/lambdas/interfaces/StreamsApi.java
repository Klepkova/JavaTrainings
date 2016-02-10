package lesson.eight.lambdas.interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class StreamsApi {

    /**
     * Создать массив строк
     * Для строк которые начинаются с буквы a создать объект содержащий случайное число
     * Отсортировать массив по случайному числу
     * Второй критерий имя в обратном порядке
     * Вывести на экран
     *
     * @param args
     */

    public static void main(String[] args) {

        List<String> list= new ArrayList<>();
        list.add("abc");
        list.add("zxc");
        list.add("qwe");
        list.add("aaa");
        list.add("abb");

        Random r = new Random();

        list.stream()
                .filter(x->x.startsWith("a"))
                .map( x-> new Ob(x, r.nextInt()))
                .sorted(Comparator
                        .comparing(Ob::getNum)
                        .thenComparing(Ob::getName)
                        .reversed())
                .forEach(System.out::println);

    }
}

class Ob {
    private String name;
    private int num;

    public Ob(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Ob{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}