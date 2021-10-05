package ch05;
//보내는 타입 맞추기 !!
public class MethodTest2 {
    public static void main(String[] args) {
        String oddEven = getOddEven(11);

        System.out.println("홀 짝 ? :" + oddEven);
        //10 > 짝수
        //17 > 홀수
    }
    public static String getOddEven(int val){
        if(val % 2 == 0){
            return " 짝수";
        }
            return " 홀수";

    }
}
