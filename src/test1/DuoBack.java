package test1;

public class DuoBack implements Chair {
    private People people;
    private int legsNum;
    private String color;
    private final static String BRAND = "듀오백";

    public DuoBack(int legsNum, String color) {
        this.legsNum = legsNum;
        this.color = color;
    }

    @Override
    public int getLegsNum() {
        return legsNum;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBrand() {
        return BRAND;
    }

    @Override
    public People whoisSitting(){
        return people;
    }

    @Override
    public void setPeople(People people) {
        this.people = people;
    }
}
