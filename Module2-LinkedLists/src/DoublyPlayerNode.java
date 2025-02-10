public class DoublyPlayerNode {
    private Player player;
    private DoublyPlayerNode nextDoublyPlayerNode;
    private DoublyPlayerNode prevDoublyPlayerNode;

    public DoublyPlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public DoublyPlayerNode getNextDoublyPlayerNode() {
        return nextDoublyPlayerNode;
    }

    public void setNextPlayerNode(DoublyPlayerNode nextPlayerNode) {
        this.nextDoublyPlayerNode = nextPlayerNode;
    }

    public DoublyPlayerNode getPrevDoublyPlayerNode() {
        return prevDoublyPlayerNode;
    }

    public void setPrevDoublyPlayerNode(DoublyPlayerNode prevDoublyPlayerNode) {
        this.prevDoublyPlayerNode = prevDoublyPlayerNode;
    }


}
