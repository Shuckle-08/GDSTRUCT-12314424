import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {
    LinkedList<Player> playerList;

    public LinkedListStack(){
        playerList = new LinkedList<Player>();
    }

    public void push(Player player){
       playerList.push(player);
    }

    public Player pop(){
        return playerList.pop();
    }

    public Player peek(){
        return playerList.peek();
    }

    public void printStack(){
        ListIterator listIterator = playerList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }


}
