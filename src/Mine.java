public class Mine extends dangerousLocation{
    public Mine(Player player, Inventory inventory) {
        super(player, "Mine", inventory, new Snake());
    }

    @Override
    public void onLocation() {
        snakeCombat();

    }
}
