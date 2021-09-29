package ch02;

public class PrintExample {
    public static  void main(String[] args){
        System.out.println("안녕하세요");
        System.out.println("안녕하세요");
        System.out.println("------");
        System.out.print("안녕하세요");
        System.out.print("안녕하세요");
        System.out.println();

        String nm = "홍길동";
        int age = 17;
        float height = 180.8f;
        char bloodtype = 'A';

        System.out.println(nm +"의 키는" + height + " cm, 나이는 " + age
                +"세" + " 혈액형은 " + bloodtype + " 이다.");
        System.out.printf("%s의 키는 %.2fcm, 나이는 %d세, 혈액형은 %c형이다.",
                nm, height, age, bloodtype);

        //  %s는 아무거나, %f 실수, %d 정수, %c 문자
        //  .2 는 소숫점 자리표시
        //  %앞에 숫자를 넣으면 앞칸 빈칸 갯수
    }
}
