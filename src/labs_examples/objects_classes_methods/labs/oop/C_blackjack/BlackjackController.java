package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();
    }

    public static void playBlackJack() {
        Deck newDeck = new Deck();
        ArrayList<Integer> usedCards = new ArrayList<>();
        newDeck.setUsedCards(usedCards);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey there! What's your name? ");
        String user_name = scanner.nextLine();
        Player player = new Player(user_name, 800);
        Player computer = new Player("Dealer", 800);
        usedCards = newDeck.deal(player, 2, usedCards);
        usedCards = newDeck.deal(computer, 2, usedCards); // update usedCards every time cards are dealt

        // check score based on initial cards dealt
        while (Play.continuePlay(player, computer)) {
            while (player.getHand().getHandValue(player.getHand().getHandCards()) < 21) {
                if (Play.hitOrStand(player).equals("hit")) {
                    usedCards = newDeck.deal(player, 1, usedCards);
                } else {
                    break;
                }
            } while (Play.continuePlay(player, computer)) {
                while (Play.aiMethod(computer, usedCards)) { //ToDo check this runs at the appropriate time
                } break;
            } break;
        } if (Play.continuePlay(player, computer)) {
            Play.finalResult(player, computer);
        }
    }
}
