package practice.TaskBuy;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by userracer on 31.01.2016.
 */
public class Usual  {

    protected int count;
    protected double costOne;
    private int[] month;
    protected int day;

    public Usual(int count, double costOne, int day) {
        this.count = count;
        this.costOne = costOne;
        month = new int[31];
        setDay(day);
    }


  public void SearchDay(int day){


      if(day!=this.day){
         System.out.println(day+" числа покупки не было");


      }else{
          System.out.println(day+" числа покупка осуществлялась");
      }
  }







    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCostOne() {
        return costOne;
    }

    public void setCostOne(double costOne) {
        this.costOne = costOne;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if((day<0)||(day>month.length))
        {
            System.out.println("Введенная дата не в границах месяца.");
        }
        else
        {
          this.day = day;
        }
    }

    public double Cost(){
        return costOne*count;
    }

    @Override
    public String toString() {
        return "Usual{" +
                "Day - " + day +
                ", costOne - " + costOne +
                ", count - " + count + ", Cost - "+Cost() +
                '}';
    }
}
