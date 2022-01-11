package test1;

public interface CanSit {
    void sit(Sitable sitable);
    void stand();//자기가 정보를 가지고 있어 매개변수 필요 x
    Sitable sittingPlace();
}
