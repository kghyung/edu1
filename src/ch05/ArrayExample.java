package ch05;

public class ArrayExample {
    public static void main(String[] args){ //psvm
        //배열(Array)

        /*
        * 같은 타입의 값을 여러개 저장할때 좋음
        * for문과 함께 사용하면 좋음
        * */
        int[] scores = {83, 90, 87, 100, 88};    //int형 배열
        /*
        scores[0] = 11;
        System.out.println(scores[0]);
        */
        System.out.println(scores.length);      //scores.length 배열의 길이

        for(int i =0; i<scores.length; i++){

            System.out.println(scores[i]);
        }

    }
}
