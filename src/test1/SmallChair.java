package test1;

import java.util.ArrayList;
import java.util.List;

public class SmallChair implements Chair {
    private final static int SEAT_COUNT =2;
    private final List<CanSit> objectThatIsBeingOccupied = new ArrayList<>();
    //내부는 변경되지만 담고있는 그릇은 final가능
    private int legsNum;
    private String color;
    private String brand;

    public SmallChair(int legsNum, String color, String brand) {
        this.legsNum = legsNum;
        this.color = color;
        this.brand = brand;
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
        return brand;
    }

    @Override
    public boolean hasEmptyPlace() {
        return ( SEAT_COUNT > objectThatIsBeingOccupied.size() );//값자체도 리턴가능
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
