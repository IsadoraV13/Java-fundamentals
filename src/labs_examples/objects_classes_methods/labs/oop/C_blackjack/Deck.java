package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

/*
Create a method that will populate the Card[] with 52 unique Card object. YES
The cards should mimic an actual card deck. It should contain four aces (spades, hearts, diamonds, clubs), ... YES
Create a deal() method that will take in a Player object and "deal" that player a random card out of the deck. YES
To get the random card, generate a random number between 1 and 52 (inclusive). YES (except Zero)
Then check the ArrayList of Integers to make sure that random number is not in there. YES
If it is, that means the card has already been drawn. You need to generate new random numbers until you find a card
that has not been drawn. If/when the random number has not yet been played add the card at the index
of random num from the Cards[] to the player's "Hand" ArrayList, then add that random number to the ArrayList<Integer>
called usedCards in the Deck class. This usedCards arraylist tracks the cards that have already been dealt. */


import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private static Card[] cards;
    private static ArrayList<Integer> usedCards;

    public Deck() {
        populateDeck();
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public void populateDeck() {
        int i = 0;
        char[] allSuit = new char[]{'♠', '♦', '♥', '♣'};
        this.cards = new Card[52];
        this.usedCards = new ArrayList<>();
        for (int suit = 0; suit < 4; suit++) {
            for (int value = 1; value <= 13; value++) {
                cards[i] = new Card(value, allSuit[suit]);
                i++;
            }
        }
//        for(Card card : cards) {
//            System.out.println(card.getCardValue() + "" + card.getCardSuit());
//        }
    }

    public static ArrayList<Integer> deal(Player player, int numCards, ArrayList<Integer> usedCards) { // 2023 refactored to include number of cards to be dealt
        java.util.Random rand = new Random();
        for (int card = 1; card <= numCards; card++) {
            int randomCard = rand.nextInt(52);
            while (usedCards.contains(randomCard)) { // if that card was already dealt, try again
                randomCard = rand.nextInt(52);
            }
            usedCards.add(randomCard);
            player.getHand().getHandCards().add(cards[randomCard]); // cannot use setHand here as it would reset every time dealt
            System.out.println("New card to " + player.getName() + ": " + cards[randomCard].getCardVal() + "" +
                    cards[randomCard].getCardSuit());
        }

        if (player.getName() != "Dealer") {
            System.out.println(player.getName() + ", your hand is " + player.getHand().getHandCards() +
                    "; that's a hand value of " + player.getHand().getHandValue(player.getHand().getHandCards()));
        } else {
            System.out.println("Check: Dealer hand is " + player.getHand().getHandCards() +
                    " with hand value of " + player.getHand().getHandValue(player.getHand().getHandCards()));
        }
        System.out.println(usedCards);
        return usedCards;

    }

}

