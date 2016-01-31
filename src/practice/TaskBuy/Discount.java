package practice.TaskBuy;

/**
 * Created by userracer on 31.01.2016.
 */
public class Discount extends Usual {
    int disc;

    public Discount (int count, double costOne, int day, int disc){
        super(count, costOne, day);
        this.disc=disc;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    @Override
    public double Cost() {
        return count*costOne*(1-disc/100.0);
    }

    @Override
    public String toString() {
        return "Discount{" +
                "Day - "+day+
                ", count - "+count+
                ", costOne - "+costOne+
                ", disc= " + disc +
                ", Cost= "+Cost()+

                '}';
    }
}
