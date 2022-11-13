public class River extends dangerousLocation {
    public River(Player player, Inventory inventory) {
        super(player, "River ", inventory, new Bear());
    }

    @Override
    public void onLocation() {
        Monster[] monsters = Monster.monsters();
        System.out.println("you entered the cave.");
        combat(2);
    }
}

