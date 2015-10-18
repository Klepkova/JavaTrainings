package lesson.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by User on 18.10.2015.
 */
public class MyInterface {
    public static void main(String[] args) {
      //  A s=new Alspi();
       // Alspi a2=new Alspi();
      //  ArrayList<Integer> list= new ArrayList<Integer>();//Дженерики - указывает тип кот храниться в листе
       // Object object=list.get(4);
        //list.size(); - возвращает реальное кол-о объектов
        //list.add(234); - добавить
        //list.remove();

        try (BufferedReader reader = new BufferedReader(new FileReader("d:/Клепкова/t.txt"))) {
            String str;
            ArrayList<String> list2=new ArrayList<String>();
            while ((str = reader.readLine()) != null) {
                if(str.trim().length()>0){
              list2.add(str);}
            }

            for(String s : list2){

                System.out.println(s);
            }


         reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        LinkedList<String> list3=new LinkedList<String>();//при удалении элемента освобождается память

        Map<String, Integer> map=new HashMap<>();
        map.put("name1",1111);
        map.put("name2",1112);
        map.put("name3",1113);
        map.put("name4",1114);

        Integer v=map.get("name2");
        System.out.println(v);
    }
}

interface MyInter{}

abstract class A{
    abstract public  void doSome();
}

class Alspi extends A{
    @Override
    public void doSome(){
        System.out.println("mpl A");
    }
}