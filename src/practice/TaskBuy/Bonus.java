package practice.TaskBuy;

/**
 * Created by userracer on 31.01.2016.
 */
public class Bonus extends Usual {
    // TODO private
    double bonus;

    public Bonus(int count, double costOne, int day, double bonus){
        super(count, costOne, day);
        this.bonus=bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double Cost() {
        return count*costOne-bonus;
    }


    @Override
    public String toString() {
        return "Bonus{" +
                "Day - "+day+
                ", count - "+count+
                ", costOne - "+costOne+
                ", bonus -  " + bonus +
                ", Cost = "+Cost()+
                '}';
    }
}
