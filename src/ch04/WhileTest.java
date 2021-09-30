package ch04;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args){
        /*
        * 숫자를 입력하세요 (정지 : 0) : 14
        * 숫자를 입력하세요 (정지 : 0) : 10
        * 숫자를 입력하세요 (정지 : 0) : 12
        * 숫자를 입력하세요 (정지 : 0) : 0
        * 더한 수 : 24
        *
        * */

        Scanner scan = new Scanner(System.in);
        int sum = 0, val = 0;
        System.out.print("숫자를 입력하세요. (정지 : 0)");
        val = scan.nextInt();
        sum = sum + val;
        while(val !=0){
            System.out.print("숫자를 입력하세요. (정지 : 0)");
            val = scan.nextInt();
            sum = sum + val;
        }
        System.out.println("합계 : " + sum);
    }
}
