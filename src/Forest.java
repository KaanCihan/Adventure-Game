public class Forest extends dangerousLocation{
    public Forest(Player player,Inventory inventory) {
        super(player, "Forest",inventory,new Vampire());
    }
    @Override
    public void onLocation() {
        Monster[] monsters = Monster.monsters();
        System.out.println("you entered the cave.");
        combat(1);
    }
}

