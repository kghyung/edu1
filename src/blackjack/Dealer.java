package blackjack;

public class Dealer extends Gamer {
    public void moreCard(CardDeck cd){
        //본인의 카드가 두장인지 확인
        //2장의 카드의 점수가 16점 이하 인지 확인.
        //16점 이하면 1장 더 한장 더뽑기

        //List<Card> localMyCards = openCards();
        myCards.get(0);

        if(myCards.size() == 2){
            int sumPoint = 0;
            for(int i=0; i<2; i++){
                Card c = myCards.get(i);
                sumPoint += c.getPoint();
            }
           if (sumPoint <= 16) {
               Card c = cd.getCard();
               receiveCard(c);

               // receiveCard((cd.getCard()));
           }
                Card c1 = myCards.get(0);
                Card c2 = myCards.get(1);



        }
    }
}
