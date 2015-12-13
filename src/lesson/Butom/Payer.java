package lesson.Butom;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by User on 06.12.2015.
 */
public class Payer {/*

    Random r = new Random();
    //List<Payer> payers = new ArrayList<>();
    //рандом
    //лист
    //
    //
    //
}


interface Pay{
int CostPerOne = 100;
    void paid(int count);

    }



class PayMan implements Pay{
    private String name;
    private String mail;
    private String passport;


    PayMan(String name, String mail, String passport) {
        this.name = name;
        this.mail = mail;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public  void paid(int count){
        System.out.println("*******");
        System.out.println("Payer"+name);
        System.out.println("Buy"+count);
        System.out.println("CostPerOne"+CostPerOne);
        int cost=CostPerOne*count;
        System.out.println("Cost"+ cost);
        System.out.println("=============");
    }
    @Override
    public String toString() {
        return "PayMan{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", passport='" + passport + '\'' +
                '}';


}

class PayFact implements Pay{
    private String name;
    private int sale;
    private int id;


}

    PayFact(String name, int sale, int id) {
        this.name = name;
        this.sale = sale;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public  void paid(int count){
        System.out.println("*******");
        System.out.println("Payer"+name);
        System.out.println("Buy"+count);
        System.out.println("CostPerOne"+CostPerOne);
        int cost=(int)(CostPerOne*count)*(100-sale)/100f;
        System.out.println("Cost"+ cost);
        System.out.println("=============");
    }

    @Override
    public String toString() {
        return "PayFact{" +
                "name='" + name + '\'' +
                ", sale=" + sale +
                ", id=" + id +
                '}';
    }*/
}