package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

// create a method named computerAI that will return true if the computer player wants another card.
// It will return false is the computer player does not want another card.
// If the computer player's hand currently has a value less than 16 it will want another card.
// If the hand value is greater than or equal to 16 the computer will not want another card.

public class Player {
    private String name;
    private Hand hand;
    private int potValue;

    public Player(String name, int potValue) {
        this.name = name;
        this.hand = new Hand(); // a value is not passed, but when a Player object is created, a new hand is initialised
        this.potValue = potValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }
// does player want another card? return Boolean
    // does dealer want another card. AI decides




}
