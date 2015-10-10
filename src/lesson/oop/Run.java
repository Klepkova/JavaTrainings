package lesson.oop;

import java.io.*;

/**
 * Created by User on 10.10.2015.
 */
public class Run {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("d:/Клепкова/t.txt"))) {
            //Reader reader = new FileReader("d:/Клепкова/t.txt");
            String str;
//            while ((str = reader.readLine()) != null) {
//                System.out.println(str);
//            }

            int sum = 0;
            while ((str = reader.readLine()) != null) {
                String[] nstr = str.trim().split(" ");

                for (int i=0; i < nstr.length; i++) {
                    try {
                        sum+= Integer.parseInt(nstr[i]);
                    }catch (NumberFormatException e){
                        System.out.println("bad value:"+e.getMessage());
                    }

                }
            }
            System.out.println("Сумма -"+sum);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}