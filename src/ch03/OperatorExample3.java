package ch03;

public class OperatorExample3 {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2; //true
        boolean result2 = n3 > n4;  //false

        System.out.println(result1 && result2); //and 연산자 (모든값이 true일때 true)
        System.out.println(result1 || result2); //or 연산자  (하나의 값이라도 ture일때 true)

        System.out.println(true && true && true && true && false); //or 연산자  (하나의 값이라도 ture일때 true)
        System.out.println(n1 >= n2 || n3 < n4 || n1 > n4); //or 연산자  (하나의 값이라도 ture일때 true)
        //확률이 높은 결과를 앞쪽에 넣는게 좋다.






    }
}
