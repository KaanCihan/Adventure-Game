public abstract class safeLocation extends Location {

    public safeLocation(Player player, String name, Inventory inventory) {
        super(player, name,inventory);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
