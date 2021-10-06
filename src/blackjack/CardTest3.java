package blackjack;

public class CardTest3 {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        CardDeck cd = new CardDeck();

        Card c1 = new Card("테스트", "7");
        Card c2 = new Card("테스트", "10");

        dealer.receiveCard(c1);
        dealer.receiveCard(c2);

        dealer.moreCard(cd);
        dealer.showAllMycards();
    }
}
