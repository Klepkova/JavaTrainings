package lesson.oop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class RecordTo {

    public static void print(List<Record> records) {
        for (Record record : records) {
            System.out.println(record);
        }
    }

    public static boolean saveTxt(List<Record> records, String path, String FileName) {
        File file = new File(path);
        if (file.exists()) {//проверка на существование файла

            String fullPath = path + File.separator + FileName;
            try (BufferedWriter writer = new BufferedWriter((new FileWriter(fullPath)))) {
                for (Record r : records) {
                    String line = String.format("%d; %s; %d\n", r.getID(), r.getName(), r.getNumber());
                    writer.write(line);
                }
                return true;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return false;
            }
        } else {
            return false;
        }
    }


    //////////////////////////////////

    public static List<Record> readTxt(String fullPath){
      List<Record> records=new ArrayList<>();
        File f = new File(fullPath);

        if(f.exists()) {

            try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
                String str=null;

                while ((str = reader.readLine()) != null) {

                    String[] fields = str.split(";");
                    if(fields.length==3){
                        int id=Integer.parseInt(fields[0].trim());
                        String name=fields[1].trim();
                        long number=Long.parseLong(fields[2].trim());

                        Record record=new Record(id, name, number);
                        records.add(record);
                    }

//                    if (str.trim().length() > 0) {
//                        list2.add(str);
//                    }
                }

//                for (String s : records) {
//
//                    System.out.println(s);
//                }


                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        return records;
    }

    public static void main(String[] args) {
//        List<Record> records = new ArrayList<>();
//        records.add(new Record(1, "name1", 213567L));
//        records.add(new Record(2, "name2", 2135237L));
//        records.add(new Record(3, "name3", 2132423467L));
//        records.add(new Record(4, "name4", 2135121254L));
//        print(records);
//        saveTxt(records, "d:\\Клепкова", "records.csv");
//        System.out.println("sdfh");

        List<Record> records = readTxt("D:\\Клепкова\\records.csv");
        print(records);
    }
}
