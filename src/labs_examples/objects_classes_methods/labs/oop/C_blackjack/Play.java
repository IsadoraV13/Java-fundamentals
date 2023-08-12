package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {


    public static String hitOrStand(Player player){ // 2023: refactored to not repeat
        String result = "";
        System.out.print("Would you like another card? Please respond 'hit' or 'stand': ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        while (!userInput.toLowerCase().equals("stand") && !userInput.toLowerCase().equals("hit")) {
            System.out.println("Please only respond 'hit' or 'stand': ");
            userInput = scanner.next();
        } if (userInput.toLowerCase().equals("stand")) {
            System.out.println(player.getName() + ", you have ended your turn");
            result = "stand";
        } else {// i.e. "hit"
            result = "hit";
        }
        return result;
    }

    public static boolean aiMethod(Player computer, ArrayList<Integer> usedCards) {
        if (computer.getHand().getHandValue(computer.getHand().getHandCards()) < 16) {
            System.out.println("Dealer requests another card");
            Deck.deal(computer, 1, usedCards);
            return true;
        } else if (computer.getHand().getHandValue(computer.getHand().getHandCards()) > 21) {
            return false;
        } else {
            System.out.println("Dealer stands");
            return false;
        }
    }

    public static boolean continuePlay(Player player, Player computer) {
        int playerScore = player.getHand().getHandValue(player.getHand().getHandCards()); //ToDo getHandValue
        int computerScore = computer.getHand().getHandValue(computer.getHand().getHandCards());
        if ((playerScore == 21 && computerScore != 21) || computerScore > 21) {
            System.out.println("You have won this game!");
            return false;
        } else if (playerScore != 21 & computerScore == 21) {
            System.out.println("Dealer wins!");
            return false;
        } else if (playerScore > 21) {
            System.out.println("I am sorry, but you've lost this game.");
            return false;
        } else if (playerScore == 21 & computerScore == 21) {
            System.out.println("Ladies and gentlemen, we have a push! " + player.getName() + ", here's your refund;" +
                    " you may choose to play another game.");
            return false;
        }
        return true;
    }

    public static void finalResult(Player player, Player computer) {
        int playerScore = player.getHand().getHandValue(player.getHand().getHandCards()); //ToDo getHandValue
        int computerScore = computer.getHand().getHandValue(computer.getHand().getHandCards());
        if (playerScore == computerScore) {
            System.out.println("Is this also a push? "); // ToDo check rules
            // ToDo game should not continue if this is the last countScore
        } else { // ToDO check which one is closer to 21
            System.out.println("which one is closer to 21");
        }
        System.out.println("Thanks for playing!");
    }
}
