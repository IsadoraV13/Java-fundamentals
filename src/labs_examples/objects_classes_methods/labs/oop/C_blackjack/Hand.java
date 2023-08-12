package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

// create a method that will return the score of the hand. The hand is an arraylist of Card objects.
// An ace is worth one, a 2 is worth two, a 3 is worth three, ... a jack is worth 10, a queen is worth 10,
// a king is worth 10. Yes

public class Hand {
    private ArrayList<Card> handCards;
    private int handValue;

    public Hand() {
        this.handCards = new ArrayList<>();
    }

    public Hand(ArrayList<Card> handCards, int handValue) {
        this.handCards = handCards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getHandCards() {
        return handCards;
    }

    public void setHandCards(ArrayList<Card> handCards) {
        this.handCards = handCards;
    }

    public int getHandValue(ArrayList<Card> handCards) {
        int handValue = 0;
        for (Card card: handCards) {
            handValue += card.getCardValue();
        }
        return handValue;
    }

    public void setHandValue(ArrayList<Card> handCards) {
        int handValue = 0;
        for (Card card: handCards) {
            handValue += card.getCardValue();
        }
        this.handValue = handValue;
    }

//    public int handScore(ArrayList<Card> handCards) {
//        int handValue = 0;
//        for (Card card: handCards) {
//            handValue += card.getCardValue();
//        }
//        return handValue;
//    }
}
