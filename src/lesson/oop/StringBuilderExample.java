package lesson.oop;

/**
 * Created by User on 10.10.2015.
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("asfgf");//добавить в конец
        String string =sb.toString();
        System.out.println(sb);
    }
}
