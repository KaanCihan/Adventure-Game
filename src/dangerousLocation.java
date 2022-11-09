public abstract class dangerousLocation extends Location {
    public dangerousLocation(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {

        return true;
    }

    public void combat(int k) {
        Monster[] monster = Monster.monsters();
        Monster m = monster[k];
        int random = (int) (Math.random() * 3);
        if (random < 1) {
            System.out.println("suddenly a " + m.getName() + " appeared in front of you.");
        } else if (random < 2) {
            System.out.println("suddenly two "+ m.getName() +" appeared in front of you.");
        } else if (random < 3) {
            System.out.println("suddenly three "+ m.getName() +" appeared in front of you.");
        }
    }
}
