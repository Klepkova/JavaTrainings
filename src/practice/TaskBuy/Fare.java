package practice.TaskBuy;

/**
 * Created by userracer on 31.01.2016.
 */
public class Fare extends Usual {
    double fare;

    public Fare(int count, double costOne, int day, double fare){
        super(count, costOne, day);
        this.fare=fare;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public double Cost() {
        return count*costOne-fare;
    }



    @Override
    public String toString() {
        return "Fare{" +
                "Day - "+day+
                ", count - "+count+
                ", costOne - "+costOne+
                ", fare - " + fare +
                ", Cost = "+Cost()+
                '}';
    }
}
