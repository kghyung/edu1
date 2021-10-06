package blackjack;

public class Card {
    private String pattern; //무늬
    private String denomination; //숫자, 값

    //1. 생성자 (클래스명과 이름이 같다.)
    //2. (리턴타입이 없다.)
    public Card(String pattern, String denomination){
        super();    //직속부모 지칭
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public  String getPattern(){
        return this.pattern;
    }
    public String getDenomination(){
        return this.denomination;
    }
    public int getPoint(){
        //denomination 값이 "A" > 1
        //"2" > 2
        //"3" > 3
        //...
        //"10" > 10
        //"J", "Q","K"> 10
        switch (denomination){
            case  "A":
                return 1;
            case  "J": case "Q": case "K":
                return 10;
            default: //"2"~"10" > 문자열을 정수형으로 pasing(파싱)
                return Integer.parseInt(denomination);
        }
    }
    @Override
    public String toString(){
        return String.format("%s - %s",this.pattern, this.denomination);
    }
}

//3번문제 정답