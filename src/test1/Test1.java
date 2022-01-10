package test1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        // 사람(아름, 성별, 나이) 과
        // 의자(다리수, 색깔, 브랜드)
        // 사람 의자에 앉는행위
        ArrayList<People> peoples = new ArrayList<>();
        ArrayList<Chair> chairs = new ArrayList<>();

        peoples.add(new SimplePeople("지은","여",26));
        peoples.add(new SimplePeople("가","남",29));
        peoples.add(new SimplePeople("나", "여", 30));

        chairs.add(new DuoBack(4,"검정"));
        chairs.add(new DuoBack(3,"빨강"));
        chairs.add(new DuoBack(5,"노랑"));

        peoples.get(1).sit(chairs.get(2));

        peoples.get(2).sit(chairs.get(2));

        peoples.get(0).sit(chairs.get(1));
        peoples.get(0).stand();
        peoples.get(0).stand();

        System.out.println();
        printChairStatus(chairs);
        System.out.println();
        printPeopleStatus(peoples, chairs);
    }
    static void printChairStatus(ArrayList<Chair> chairs){//n번 의자는 (사람이름)님이 사용 중 입니다.
        for(int i = 0; i<chairs.size() ; i++){
            Chair chair = chairs.get(i);
            People sitPeople = chair.whoisSitting(); //줄여서 적는게 좋을까?
            if(sitPeople==null){
                System.out.printf("%d번 의자는 사람이 없습니다.\n",i+1);
            }else{
                System.out.printf("%d번 의자는 %s님이 사용 중 입니다.\n",i+1,sitPeople.getName());
            }
        }
    }
    static void printPeopleStatus(ArrayList<People> peoples ,ArrayList<Chair> chairs){ //(사람이름)님은 몇번 의자에 앉아 있습니다.
        for(People people : peoples){
            Chair chair = people.sittingChair();
            if(chair==null){
                System.out.printf("%s님은 아무 의자에도 앉아있지 않습니다.\n",people.getName());
            }else{
                System.out.printf("%s님은 %d번 의자에 앉아 있습니다.\n",people.getName(), chairs.indexOf(chair)+1);
            }
        }
    }//
}
