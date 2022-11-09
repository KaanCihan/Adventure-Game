public class Forest extends dangerousLocation{
    public Forest(Player player) {
        super(player, "Forest");
    }
    @Override
    public boolean onLocation() {
        Monster[] monsters = Monster.monsters();
        System.out.println("you entered the cave.");
        combat(1);
        return true;
    }
}

