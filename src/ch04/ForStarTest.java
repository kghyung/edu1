package ch04;

public class ForStarTest {
    /*
    * if star = 2
    * **
    * if star = 3
    * ***
    * if star = 4
    * ****
    * */
    public static void main(String[] args){
        int star = (int)(Math.random() * 5) + 2;
            System.out.println("if star = " + star);

            for (int i = 0; i < star; i++){
                for(int j = 0; j < star; j ++){
                    System.out.print("*");
                    }
                    System.out.println();
            }
    }
}
