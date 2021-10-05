package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = {100, 87, 56, 23, 28, 90, 30, 32};
        //점수가 짝수인 친구들만 점수 프린트 하고
        //점수가 홀수인 친구들의 합계 점수도 프린트

        int oddSum = 0;
        for(int i=0; i<scores.length; i++){
            if(scores[i] % 2 == 0){
                System.out.printf("scores[%d] : %d\n", i, scores[i]);
        }else{
                oddSum += scores[i];
            }
            System.out.println("홀수 합계 : " + oddSum);
        }
    }
}
