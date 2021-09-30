package ch04;

public class RandomeExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 11);
        System.out.println("num : " + num);

        //2~7
        int num2 = (int) (Math.random() * 6) + 2;

        //55~108
        int num3 = (int) (Math.random() * 54) + 55;
        System.out.println("num : " + num3);

        //64~89
        int num4 = (int)(Math.random() * 25) + 64;
        System.out.println("num : " + num4);

    }
    }
