package test1;

public class SimplePeople implements People {
    private final String name;
    private final String gender;
    private int age;
    private Chair chair; //앉을 의자는 무엇인지 모름

    SimplePeople(String name, String gender, int age){
        this.name =name;
        this.gender=gender;
        this.age=age;
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
    public Chair sittingChair() {
        return this.chair;
    }

    @Override
    public void sit(Chair chair) {
        if(chair.whoisSitting()!=null) {
            System.out.println("이미 사용 중인 의자 입니다.");
        }else {
            this.chair = chair;
            chair.setPeople(this);
        }
    }

    @Override
    public void stand() {
        if(this.chair==null){
            System.out.printf("%s님은 이미 서있습니다.\n",this.name);
        }else{
            this.chair.setPeople(null);
            this.chair=null;
        }
    }

}
