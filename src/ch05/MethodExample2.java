package ch05;

public class MethodExample2 {
    //input O, output O (비void형)
    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println("sum : " + result);
    }
        public static int sum(int n1, int n2){      //비void는  리턴키워드 생략 불가!!!! 리턴타입도 같아야 한다.
            return n1 + n2 ;
        }
}

