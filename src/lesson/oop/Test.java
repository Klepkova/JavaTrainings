package lesson.oop;

public class Test {
    public static void main(String[] args) {
        int a;
        a=15;
        String b=new String();

        int c=a;
        String d=new String(b);

        String[] str;
        str=new String[10];
        int[] str1={1, 2, 3, 4, 5};
        String[] str2=new String[a];

         Simple ex1=new Simple(1, "str");
        Simple ex2=new Simple();

    }
}

class Simple {
    int a;
    String s;

    Simple(int a, String s) {
        this.a = a;
        this.s = s;
    }

    Simple() {}

    public int getA() {
        return a;
    }

    public String getS() {
        return s;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }
}
