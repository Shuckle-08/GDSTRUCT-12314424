public class Main {
    public static void main(String[] args){
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Saitama", 999));
        playerLinkedList.addToFront(new Player(2, "Deku", 100));
        playerLinkedList.addToFront(new Player(3, "Saiki K.", 500));

        playerLinkedList.printLinkedList();
        playerLinkedList.size();
//        playerLinkedList.removeFirstElement();
        playerLinkedList.printLinkedList();
        playerLinkedList.size();

        // Check if a player exists
        System.out.println("Contains Saiki K.? " + playerLinkedList.contains(new Player(3, "Saiki K.", 500)));

        // Find index of a player
        System.out.println("Index of Deku: " + playerLinkedList.indexOf(new Player(2, "Deku", 100)));

        //Start of Doubly Linked List
        System.out.println("\nStart of Doubly Linked List Implementation\n");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addToFront(new Player(1, "Saitama", 999));
        doublyLinkedList.addToFront(new Player(2, "Deku", 100));
        doublyLinkedList.addToFront(new Player(3, "Saiki K.", 500));

        doublyLinkedList.printDoublyLinkedList();
    }
}
