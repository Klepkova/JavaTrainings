package lesson.stuff;


            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileReader;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.List;

            public class ReadObjects {

                public static List<Stuff> read(String path) throws IOException {

                    List<Stuff>strings = new ArrayList<>();

                    File file = new File(path);
                    try(BufferedReader reader = new BufferedReader(new FileReader(file))){

                        reader.readLine();

                        String tmp;
                        while((tmp=reader.readLine())!=null){
                            String[] s=tmp.split(";");
                            if(s.length==2){
                                String type = s[0].trim();
                                int count = Integer.parseInt(s[1].trim());

                                Stuff stuff = new Stuff(type, count);
                                strings.add(stuff);
                            }

                        }

        }catch (IOException e){
            throw e;
        }





        return strings;
    }

    public static void main(String[] args){
        try{
            List<Stuff> strings = read("d:\\Клепкова\\stuff.txt");
            Collections.sort(strings, new Comparator<Stuff>() {
                @Override
                public int compare(Stuff o1, Stuff o2) {
                    return o1.getType().compareTo(o2.getType());
                }
            });
            System.out.println("------------");
            for(Stuff str : strings) {
                System.out.println(str);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());}
    }

}
