package test1;

public class SitPeople implements People {
    private final String name;
    private final String gender;
    private final int age;
    private Sitable sitable; //앉을 의자는 무엇인지 모름

    SitPeople(String name, String gender, int age){
        this.name =name;
        this.gender=gender;
        this.age =age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public Sitable sittingPlace() {
        return this.sitable;
    }

    @Override
    public void sit(Sitable sitable) {
        if(this.sitable!=null){
            if(this.sitable==sitable) {
                System.out.println("이미 해당 자리에 앉아있습니다.");
            }else{
                this.stand();
            }
        }
        if(sitable.hasEmptyPlace()) {
            sitable.addObjectThatIsBeingOccupied(this);
            this.sitable = sitable;
        }else {
            System.out.println("앉을 수 있는 공간이 없습니다.");
        }
    }

    @Override
    public void stand() {
        if(this.sitable ==null){
            System.out.printf("%s님은 이미 서있습니다.\n",this.name);
        }else{
            this.sitable.removeObjectThatIsBeingOccupied(this);
            this.sitable =null;
        }
    }

}
