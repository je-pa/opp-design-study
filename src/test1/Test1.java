package test1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // 사람(아름, 성별, 나이) 과
        // 의자(다리수, 색깔, 브랜드)
        // 사람 의자에 앉는행위
        Board checkerBoard = new CheckerBoard(5,5);
        checkerBoard.setXY(1,3,new SitPeople("지은","여",26));
        checkerBoard.setXY(2,4,new SitPeople("가","남",30));
        checkerBoard.setXY(3,4,new SmallChair(4,"검정","이케아"));

        for(int i=0 ; i<checkerBoard.getXSize() ; i++){
            for(int j=0 ; j<checkerBoard.getYSize() ; j++){
                System.out.printf("(%d , %d)공간 : %s , \n",i,j,checkerBoard.getXY(i,j));
            }
        }
    }
}
