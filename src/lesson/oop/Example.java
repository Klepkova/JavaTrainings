package lesson.oop;


import java.io.*;
import java.nio.file.FileSystemNotFoundException;

public class Example {

    public static void readFile() {
        BufferedWriter writer=null;
        try {
            writer = new BufferedWriter(new FileWriter("D:/dt.txt"));
            writer.write("asrffg\n");
            writer.write("asrffg\n");
            writer.write("asrffg\n");
            writer.write("asrffg\n");

        }  catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(writer!=null)
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }}
    public static void main(String[] args) {
      try{
         int r=45/1;
          String s=null;
          s.compareTo("asd");
      }catch(NullPointerException e){
          System.out.println("222");
      }

      catch(ArithmeticException e){
          e.printStackTrace();
      }catch(RuntimeException ewer){

      }
    }
}
