public class River extends dangerousLocation{
    public River(Player player,Inventory inventory) {
        super(player, "River ",inventory);
    }
    @Override
    public boolean onLocation() {
        Monster[] monsters = Monster.monsters();
        System.out.println("you entered the cave.");
        combat(2);
        return true;
    }
}

