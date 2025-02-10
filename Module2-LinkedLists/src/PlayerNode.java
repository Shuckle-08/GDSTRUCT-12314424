import java.util.Objects;

public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayerNode;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayerNode() {
        return nextPlayerNode;
    }

    public void setNextPlayerNode(PlayerNode nextPlayerNode) {
        this.nextPlayerNode = nextPlayerNode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PlayerNode that = (PlayerNode) o;
        return Objects.equals(player, that.player) && Objects.equals(nextPlayerNode, that.nextPlayerNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, nextPlayerNode);
    }
}
