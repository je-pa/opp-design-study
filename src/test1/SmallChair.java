package test1;

import java.util.List;

public class SmallChair implements Chair {
    private final static int SEAT_COUNT =2;
    private List<CanSit> objectThatIsBeingOccupied;

    private int legsNum;
    private String color;
    private String BRAND;

    public SmallChair(int legsNum, String color) {
        this.legsNum = legsNum;
        this.color = color;
    }

    @Override
    public int getSeatCount() { return SEAT_COUNT; }

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
    public boolean hasEmptyPlace() {
        if(SEAT_COUNT >= objectThatIsBeingOccupied.size()){
            return true;
        }return false;
    }

    @Override
    public List<CanSit> getObjectThatIsBeingOccupied() {
        return objectThatIsBeingOccupied;
    }

    @Override
    public void setObjectThatIsBeingOccupied(CanSit canSit) {

    }
}
