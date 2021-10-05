package ch05;

public class ArrayInArrayTest {
    /*
    *
    *   김영희 총점 : 몇점, 평균 : 몇점
    *   김철수 총점 : 몇점, 평균 : 몇점
    *   홍길동 총점 : 몇점, 평균 : 몇점
    *   수학 : 몇점 평균 : 몇점
    *   영어 : 몇점 평균 : 몇점
    *   국어 : 몇점 평균 : 몇점
    *
    * */
    public static void main(String[] args) {
        int [][] scores = {
                {75, 100, 88}, //수학 0
                {98, 100, 76}, //영어 1
                {100, 90, 100} //국어 2
        };
        for(int i=0; i<scores.length; i++){

            for(int j=0; j<scores.length; j++){

                System.out.println("%d 점");
            }
        }
    }
}





