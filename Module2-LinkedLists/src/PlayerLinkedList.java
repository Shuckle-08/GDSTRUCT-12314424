public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player){
        PlayerNode newNode = new PlayerNode(player);
        newNode.setNextPlayerNode(head);
        head = newNode;
    }

    public void printLinkedList(){
        System.out.print("[HEAD] -> ");
        PlayerNode current = head;

        while (current != null){
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();
        }

        System.out.print("NULL");
    }

    public void removeFirstElement(){
        PlayerNode nextHead = head.getNextPlayerNode();
        head = nextHead;
    }

    public void size(){
        int sizeOfList = 1;
        PlayerNode current = head;
        PlayerNode temp;

        while (current.getNextPlayerNode() != null){
            sizeOfList++;
            current = current.getNextPlayerNode();
        }
        System.out.println("\nSize of the List is " + sizeOfList);
    }

    // Check if the linked list contains a specific player
    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }
            current = current.getNextPlayerNode();
        }
        return false;
    }

    // Find the index of a player in the linked list
    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayerNode();
            index++;
        }
        return -1; // Player not found
    }
}
