package ch02;

public class VariableExample3 {
    public static void main(String[] args) {
        char c = 'B';   //char형은 한문자만
        System.out.println("");
        System.out.printf("%c : %d\n", c, (int)c);

        int i = 69;
        System.out.printf("%c : %d\n", (char)i, i);

        boolean bl = false;


        System.out.println(bl);
    }
}
//boolean
//byte < char < short < int < long < float < double < String