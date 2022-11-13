public class Cave extends dangerousLocation {
    public Cave(Player player,Inventory inventory) {

        super(player, "Cave",inventory, new Zombie());
    }

    @Override
    public void onLocation() {
        Monster[] monsters = Monster.monsters();
        System.out.println("you entered the cave.");
        combat(0);
    }
}
