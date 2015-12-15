package lesson.oop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Telefon {
    public static List<String> read(String path) throws IOException {

        List<String> tel = new ArrayList<>();
        Pattern pattern=Pattern.compile("(\\+\\d{3}[ \\(]\\d{2}\\)[ \\d]{3}\\-[\\d]{2}\\-[\\d]{2})");
        File file = new File(path);
       // Matcher matcher=pattern.matcher("123");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){

            String tmp;
            while((tmp=reader.readLine())!=null){
                Matcher matcher=pattern.matcher(tmp);
                if(matcher.matches()) {
                    tel.add(tmp);
                }
            }

        }catch (IOException e){
            throw e;
        }





        return tel;
    }

    public static void main(String[] args){
        try{
            List<String> tel = read("d:\\Клепкова\\txt.txt");
            for(String str : tel) {
                System.out.println(str);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());}
    }

}
