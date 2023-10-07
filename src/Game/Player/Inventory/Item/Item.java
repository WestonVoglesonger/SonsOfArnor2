package Game.Player.Inventory.Item;

public interface Item {

    long getValue();

    String getName();

    String getDescription();

    void setEncumbrance(long encumbrance);
}
