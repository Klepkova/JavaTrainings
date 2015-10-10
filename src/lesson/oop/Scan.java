package lesson.oop;

import java.util.Scanner;

/**
 * Created by User on 10.10.2015.
 */
public class Scan {

    public static  void print(int a){
        System.out.println("one :" +a);
    }

    public static  void print(int a, int ... b){
        System.out.println("two :" +a);
        for(int bValue: b){
            System.out.println(bValue);
        }
    }

    public static  void print(int a, int b){
        System.out.println("three :" +a +" "+b);
    }

    public static double mean(double ... values){
        double sum=0;
        for(double valuesValue: values){

            sum=sum+valuesValue;
        }
        double sr=sum/values.length;
        return sr;

    }


    public static void main(String[] args) {

        print(345, 345);
        System.out.println(mean(1, 2, 3, 4, 5));
 //       int a;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number");
//        while (!scanner.hasNextInt()) {
//            System.out.println("Try again");
//            scanner.nextLine();
//        }
//         a = scanner.nextInt();
//        System.out.println("entered:" +a);

    }

}

