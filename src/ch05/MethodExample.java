package ch05;

public class MethodExample {
/*
                    //'전체' 리턴 타입
    public static void main(String[] args){ /*파라미터(매개변수) 비어있으면 외부에서 값을 받지 않음 * /
                  //'void' 메소드명       //메소드 선언부
                  //'void'와(아웃풋이 있다) 비'void'(아웃풋이 없다)
//메소드 구현부
    }
}

 */
public static void main(String[] args) {
    sum(10, 20);    //값만 보내야함
    sum(50, 120);
    minus(100, 50);
}

    public static void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }

    public static void minus(int n1, int n2) {
        System.out.println("minus : " + (n1 - n2));
    }
}