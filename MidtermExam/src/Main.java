import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in); // Scanner created once

        CardStack playerDeck = new CardStack();
        CardStack playerHand = new CardStack();
        CardStack discardDeck = new CardStack();

        fillCardStack(playerDeck);
        transferCards(playerDeck, playerHand, rnd.nextInt(5) + 1);

        while (!playerDeck.isEmpty()) {
            int rndNum = rnd.nextInt(5) + 1;   // Generate a new number each loop
            int rndAction = rnd.nextInt(3) + 1;

//            System.out.println("rndNum: " + rndNum + " rndAction: " + rndAction);

            switch (rndAction) {
                case 1: // Draw from deck
                    transferCards(playerDeck, playerHand, rndNum);
                    break;
                case 2: // Discard cards
                    transferCards(playerHand, discardDeck, rndNum);
                    break;
                case 3: // Draw from discard
                    if (!discardDeck.isEmpty()) {
                        transferCards(discardDeck, playerHand, rndNum);
                    } else {
                        System.out.println("⚠️ Discard deck is empty! Skipping draw.");
                    }
                    break;
                default:
                    break;
            }

            printCurrentStacks(playerDeck, playerHand, discardDeck);

            System.out.println("Press Enter to continue...");
            scanner.nextLine();  // Wait for Enter press
        }

        scanner.close(); // Close scanner when done
    }

    public static void fillCardStack(CardStack deck){
        deck.push(new Card("Hello Kitty"));
        deck.push(new Card("My Melody"));
        deck.push(new Card("Kuromi"));
        deck.push(new Card("Cinnamoroll"));
        deck.push(new Card("Pompompurin"));
        deck.push(new Card("Badtz-Maru"));
        deck.push(new Card("Keroppi"));
        deck.push(new Card("Tuxedosam"));
        deck.push(new Card("Chococat"));
        deck.push(new Card("Pekkle"));
        deck.push(new Card("Wish me mell"));
        deck.push(new Card("Little Twin Stars"));
        deck.push(new Card("Kiki"));
        deck.push(new Card("Lala"));
        deck.push(new Card("Sugarbunnies"));
        deck.push(new Card("Usahana"));
        deck.push(new Card("Pochacco"));
        deck.push(new Card("Tiny Chum"));
        deck.push(new Card("Marumofubiyori"));
        deck.push(new Card("Hangyodon"));
        deck.push(new Card("Dear Daniel"));
        deck.push(new Card("Charmmy Kitty"));
        deck.push(new Card("Spottie Dottie"));
        deck.push(new Card("Corocorokuririn"));
        deck.push(new Card("Pandapple"));
        deck.push(new Card("Shinkansen"));
        deck.push(new Card("Patty & Jimmy"));
        deck.push(new Card("Monkichi"));
        deck.push(new Card("Minna no Tabo"));
        deck.push(new Card("Jewelpet"));
    }

    public static void printCurrentStacks(CardStack playerDeck, CardStack playerHand, CardStack discardDeck) {
        System.out.println("\nCurrent Hand:");
        if (!playerHand.isEmpty()) {
            playerHand.printStack();  // Still prints all cards in hand
        } else {
            System.out.println("Empty");
        }

        System.out.println("\n\nCurrent Deck: " + playerDeck.getSize() + " cards");

        System.out.println("\n\nDiscards: " + discardDeck.getSize() + " cards");
    }


    public static void transferCards(CardStack drawFrom, CardStack drawTo, int numToDraw){
        for (int i = 0; i < numToDraw; i++){
            if (drawFrom.isEmpty()) break; // Prevent pop() on empty stack
            drawTo.push(drawFrom.pop());
        }
    }
}
