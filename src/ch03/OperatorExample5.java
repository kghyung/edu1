package ch03;

public class OperatorExample5 {
    public static void main(String[] args){
        //삼항식

        int n1 = 10;
        int n2 = 11;

        String result =n1 >= n2 ? "n1이 n2보다 크거나 같다 " : "n2가 n1보다 작다 ";
                            //1항               2항                    3항
        System.out.println(result);

        //mod(나머지) 짝수는 0, 홀수는 1
        int n3 = 10;
        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(12 % 2);
        System.out.println(13 % 2);

    }
}
