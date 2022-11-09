public class Cave extends dangerousLocation {
    public Cave(Player player) {

        super(player, "Cave");
    }

    @Override
    public boolean onLocation() {
        Monster[] monsters = Monster.monsters();
        System.out.println("you entered the cave.");
        combat(0);
        return true;
    }
}
