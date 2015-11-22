package lesson.oop;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Pattern pattern=Pattern.compile("(\\+\\d{3}[ \\(]\\d{2}\\)[ \\d]{3}\\-[\\d]{2}\\-[\\d]{2})");
        Matcher matcher=pattern.matcher("234");
        System.out.println(matcher.matches());
        String text =" ewaert ardtrt srta@sdf.con rtrt dsf@dg.com srg";
        matcher=pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

        String str=in.nextLine();
         matcher=pattern.matcher(str);
        System.out.println(matcher.matches());

    }
}
