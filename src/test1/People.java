package test1;

public interface People {
    String getName();
    String getGender();
    int getAge();

    Chair sittingChair();

    void sit(Chair chair);
    void stand();
}
