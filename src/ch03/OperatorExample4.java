package ch03;

public class OperatorExample4 {
    public static void main(String[] args){
        int n1 = 10;
        n1++;
        ++n1;

        System.out.println(n1);
        System.out.println();
        n1--;

        int n2 = 40;

        System.out.println(n2++); //++가 뒤로 오면 지정된 값 출력 후 +된다. ++가 앞으로 오면 1을 더한 후 출력된다.
        System.out.println(n2);
        System.out.println();

        int n3 = 50;
        n3 = n3 + 3;
        n3 = n3 + 3;
        System.out.println("n3 : " + n3); //사칙연산 다 가능
        System.out.println();

        int n4 = 50;
        n4 += 3;
        n4 += 3;
        System.out.println("n4 : " + n4); //사칙연산 다 가능


    }
}
