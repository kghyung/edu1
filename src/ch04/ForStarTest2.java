package ch04;

public class ForStarTest2 {
    public static void main(String[] args){
        /*
        *
        * if star == 2
        * *
        * **
        *
        * if star == 3
         * *
         * **
        *  ***
        * if star == 4
         * *
         * **
         * ***
         * ****
        * */
        int star = (int)(Math.random() * 5) + 2;
        for(int i = 1; i <= star; i++){
            for(int z =1; z<=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int d = 1; d <= star; d ++){
            for(int x = 1; x<= d; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
