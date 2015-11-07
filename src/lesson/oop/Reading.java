package lesson.oop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07.11.2015.
 */
public class Reading {
    public static List<String> read(String path) throws IOException {

        List<String>strings = new ArrayList<>();

        File file = new File(path);
       try(BufferedReader reader = new BufferedReader(new FileReader(file))){

           String tmp;
           while((tmp=reader.readLine())!=null){
               strings.add(tmp);
           }

       }catch (IOException e){
           throw e;
       }





        return strings;
    }

    public static void main(String[] args){
        try{
        List<String> srtings = read("d:\\Клепкова\\txt.txt");
        for(String str : srtings) {
            System.out.println(str);
        }
    }catch (IOException e){
            System.out.println(e.getMessage());}
    }

}
