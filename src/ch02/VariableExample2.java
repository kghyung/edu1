package ch02;

public class VariableExample2 {
    public static void main(String[] args){
        float f;
        double d;
        int n1;

        //n1 = 10.1; int 타입으로 안들어가짐
        f = (float)10.1;
        d = 10.1;

        double d2 = (double) (f * f); //자동 형변환
        double d3 = (double) f * f; //자동 형변환
        //double d2 = (double) f * f; //이렇게 해준다

        //float f2 = d * d;  //자동 형변환 안 해준다
        float f2 = (float)(d * d);  //수동 형변환 해줘야 한다.
        float f3 = (float) d * (float)d ;
        System.out.println(d2);

    }

}
