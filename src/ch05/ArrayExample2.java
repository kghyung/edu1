package ch05;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = new int[10];     //정수형 변수는 기본적으로 0으로 세팅

        //0번방에는 100, 1번 200, 2번 300, 3,400, 4,500

        for(int i = 0; i<arr.length; i++){
            arr[i] = (i + 1) * 100;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println( arr[i] );
        }
    }
}
