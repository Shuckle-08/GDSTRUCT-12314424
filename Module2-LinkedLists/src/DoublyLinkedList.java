public class DoublyLinkedList {
    private DoublyPlayerNode head;
    private DoublyPlayerNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToFront(Player player) {
        DoublyPlayerNode newNode = new DoublyPlayerNode(player);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextPlayerNode(newNode);
            head.setPrevDoublyPlayerNode(tail);
            tail = newNode;
        }
    }

    public void printDoublyLinkedList() {
        System.out.print("[HEAD] -> ");
        DoublyPlayerNode current = head;
        while (current != null) {
            System.out.print(current.getPlayer() + " <-> ");
            current = current.getNextDoublyPlayerNode();
        }
        System.out.println("null");
    }
}
