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
    public boolean addObjectThatIsBeingOccupied(CanSit canSit) {
        if(this.hasEmptyPlace()) {
            return objectThatIsBeingOccupied.add(canSit);
        }else {
            System.out.println("앉을 수 있는 공간이 없습니다.");
            return false;
        }
    }

    @Override
    public boolean removeObjectThatIsBeingOccupied(CanSit canSit) {
        return objectThatIsBeingOccupied.remove(canSit);
    }
}
