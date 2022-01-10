package test1;

public interface People extends CanSit{
    String getName();
    String getGender();
    int getAge();

    Chair sittingChair();


}
