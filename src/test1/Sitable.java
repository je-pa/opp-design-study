package test1;

import java.util.List;

public interface Sitable {
    boolean hasEmptyPlace();
    List<CanSit> getObjectThatIsBeingOccupied();
    void setObjectThatIsBeingOccupied(CanSit canSit);
}
