import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class CardStack {
    LinkedList<Card> cardList;

    public CardStack(){
        cardList = new LinkedList<Card>();
    }

    public void push(Card card){
        cardList.push(card);
    }

    public Card pop(){
        if (cardList.isEmpty()) return null;
        return cardList.pop();
    }

    public Card peek(){
        return cardList.peek();
    }

    public int getSize(){
        return cardList.size();
    }

    public boolean isEmpty() {
        return cardList.isEmpty();
    }

    public void printStack() {
        ListIterator<Card> listIterator = cardList.listIterator();
        int count = 0;

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next().getName() + ", ");
            count++;

            if (count == 5) {  // After printing 5 cards, go to the next line
                System.out.println();
                count = 0;  // Reset counter for the next line
            }
        }
    }
}