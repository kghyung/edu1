package ch05;

public class MethodTest {
    public static void main(String[] args) {
        printMyself("황장군", 17, 180.82f,'A');
        //황장군의 키는 180.82cm, 나이는 17세, 혈액형은 'A'형 이다.

        int mon = (int)(Math.random() * 12 ) + 1;
        printSeason(mon);
    }

    public static void printMyself(String name, int age, float height, char bloddType) {
        System.out.printf("%s의 키는 %.2f cm, 나이는 %d 세, 혈액형은 %c형이다.\n", name, height, age, bloddType);
    }

    public static void printSeason(int mon) {
        System.out.println("mon : " + mon);
        if(mon < 1 || mon > 12){
            System.out.println("알 수 없음");
        }else if(mon == 12 || mon < 3){
            System.out.println("겨울");
        }else if(mon < 9){
            System.out.println("봄");
        }else if(mon < 6){
            System.out.println("여름");
        }else {
            System.out.println("가을");
        }
    }
}
