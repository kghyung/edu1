package ch02;

public class VariableTest {
    public static void main(String[] args) {
  /*
        1. 정수는 실수를 저장할 수 없다.
        2. 작은타입에서 큰타입으로 자동형변환이 이루어진다. (수동도 가능)
        3. 큰타입에서 작은 타입으로는 자동형변환이 안된다. (무조건 수동으로 해야 가능)
   */
        int n1 = 10;
        int n2 = 3;
        //double result = (float) n1 / n2;
        //double result =  n1 / (double)n2;
        double result = (float) n1 / (float)n2;
        System.out.println("결과3" + result );
    }
}
