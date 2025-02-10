import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        List<Player> playerList= new ArrayList<Player>();
        playerList.add(new Player(1,"Saitama",999));
        playerList.add(new Player(2,"Deku",100));
        playerList.add((new Player(3,"Saiki K.", 500)));

        //Initial Content of List
        System.out.println("Initial Values");
        printArrayList(playerList);

//        //Get element based of index
//        int playerIndex = 1;
//        System.out.println("\nGet Element at " + playerIndex);
//        System.out.println(playerList.get(playerIndex));
//
//        //Insert element
//        System.out.println("\nInsert element at " + playerIndex);
//        playerList.add(playerIndex, new Player(4,"Sakamoto", 10));
//        printArrayList(playerList);
//
//        //Remove element
//        playerIndex = 0;
//        System.out.println("\nRemove element at " + playerIndex);
//        playerList.remove(playerIndex);
//        printArrayList(playerList);

        //Check if player is in the list
        System.out.println("\nCheck if player exists");
        boolean found = playerList.contains(new Player(3,"Saiki K.", 500));
        int foundIndex = playerList.indexOf(new Player(3,"Saiki K.", 500));
        System.out.println("Found player? " + found + " at index " + foundIndex);

    }

    private static void printArrayList(List<Player> players){
        for (Player p : players){
            System.out.println((p));
        }
    }
}
