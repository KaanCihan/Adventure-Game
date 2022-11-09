public class Cave extends dangerousLocation {
    public Cave(Player player,Inventory inventory) {

        super(player, "Cave",inventory);
    }

    @Override
    public boolean onLocation() {
        Monster[] monsters = Monster.monsters();
        System.out.println("you entered the cave.");
        combat(0);
        return true;
    }
}
