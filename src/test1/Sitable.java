package test1;

import java.util.List;

public interface Sitable {
    boolean hasEmptyPlace();
    List<CanSit> getObjectThatIsBeingOccupied();
    boolean addObjectThatIsBeingOccupied(CanSit canSit);
    boolean removeObjectThatIsBeingOccupied(CanSit canSit);
}
