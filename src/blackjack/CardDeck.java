package blackjack;

import ch06.Car;

import java.util.ArrayList;
import java.util.List;

public class CardDeck { //기본 생성자            메소드, 생성자 다른점 2가지 (클래스명과 이름이 같다.)(return 타입이 없다.)
    private List<Card> cards;

    public CardDeck(){
        init();
    }

    private void init(){
       String[] patterns = new String[]{ "스페이드", "하트", "클럽", "다이아몬드" };
        cards = new ArrayList();
        for(int i =0; i< patterns.length; i++){     //4번 돈다.
            for(int z=1; z<=13; z++){               //13번 돈다.
                String denomination = null;
                switch (z){
                    case 1:
                        denomination = "A"; break;
                    case 11:
                        denomination = "J"; break;
                    case 12:
                        denomination = "Q"; break;
                    case 13:
                        denomination = "K"; break;
                    default:
                        denomination = String.valueOf(z);   //2~10은 정수를 문자열로 변경
                        // denomination = z + "";
                        Card c = new Card(patterns[i], denomination);
                       //둘중에 하나라도 가능
                        cards.add(c);
                        //cards.add(patterns[i], denomination);
                }
            }
        }
    }

    //항상 호출하면 랜덤한 카드를 준다.
    public Card getCard(){
        //if 컬렉션을 배열로 했다면 먼저 섞고, 순차적으로 카드를 주었을 것이다.
        //if 컬렉션을 ArrayList로 했다면 랜덤하게 카드를 준다.
        int rIdx = (int)(Math.random() * cards.size());
        return cards.remove(rIdx);

       // return cards.remove((int)(Math.random() * cards.size()));
    }


    public void showAllCards(){
        /*
        for(int i=0; i<cards.size(); i++){
            Card c = cards.get(i);
            System.out.println(c);
        }
         */

        for(Card c : cards){
            System.out.println(c);
        }
    }
}
