package ch05;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];    //첫째 행, 둘째 열
        System.out.println(arr.length); //행수
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
                        //2
        for(int i=0; i<arr.length; i++){
                        //3
            for(int z= 0; z<arr[i].length; z++){
                System.out.printf("(%d, %d) : %d\t", i, z, arr[i][z]);
            }
            System.out.println();
        }
    }
}
