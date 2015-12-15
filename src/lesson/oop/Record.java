package lesson.oop;

public class Record {
    private int ID;
    private String name;
    private long number;

    public Record(int ID, String name, long number) {
        this.ID = ID;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Record{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}


