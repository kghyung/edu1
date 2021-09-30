package ch04;

public class IfTest {
    public static void main(String[] args){
        int score = 93;
        //  점수가 90점이상이면 A등급
        //  점수가 80점이상이면 B등급
        //  점수가 70점이상이면 C등급
        //  점수가 70점미만이면 D등급
        //  C등급 이상이면 7점 이상이면 +, 3점 이하면 -

        // 예) 98점이면 A+
        // 예) 85점이면 B
        // 예) 73점이면 C-

        if(score >= 90){
            System.out.println(" A 등급 ");
            if(score >=97){
                System.out.println(" A + ");
            }
            else{
                System.out.println(" A - ");
            }
        }
        else if(score >= 80){
            System.out.println(" B 등급 ");
            if(score >=87){
                System.out.println(" B + ");
            }
            else{
                System.out.println(" B - ");
            }
        }
        else if(score >= 70){
            System.out.println(" C 등급 ");
            if(score >=77){
                System.out.println(" C + ");
            }
            else{
                System.out.println(" C - ");
            }
        }
        else{
            System.out.println(" D 등급");
        }
    }
}
