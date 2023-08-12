package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    private int cardValue;
    private char cardSuit;
    private String cardVal;

    public Card(int cardValue, char cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
        this.cardVal = announceCard(cardValue);
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public char getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(char cardSuit) {
        this.cardSuit = cardSuit;
    }

    public String getCardVal() {
        return cardVal;
    }

    public void setCardVal(String cardVal) {
        this.cardVal = cardVal;
    }

    public String announceCard(int cardValue) {
        String cardVal = "";
        if (cardValue == 1) {
            cardVal = "Ace";
            return cardVal;
        } else if (cardValue == 11) {
            cardVal = "Queen";
            return cardVal;
        } else if (cardValue == 12) {
            cardVal = "Jack";
            return cardVal;
        } else if (cardValue == 1) {
            cardVal = "King";
            return cardVal;
        } else {
            cardVal = String.valueOf(cardValue);
            return cardVal;
        }
    }

    @Override
    public String toString() {
        return cardVal +
                " of " + cardSuit;
    }


}

