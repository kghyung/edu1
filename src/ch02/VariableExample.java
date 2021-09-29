package ch02;

public class VariableExample {
    public static void main(String[] args){
        int score;
        score = 10;
        System.out.println(score);
        System.out.println(10);

        score = 20;
        System.out.println(score);
        System.out.println(20);

        System.out.println(score + score);
        System.out.println(score);

        score = score + score + score;
        System.out.println(score);

        short s1 = 128;
        byte b1 = (byte) s1;
        System.out.println(b1);

        final  int score2 = 11;
        //score2 = 12; 안됨. final 변수는 바꿀수 없음 *상수로 바뀜 변경 안됨
    }
}
