public class SafeHouse extends safeLocation{

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }



    @Override
    public boolean onLocation(){
        System.out.println("You are fully healed!!");
        this.getPlayer().setHealth(this.getPlayer().getMaxHealth());
        System.out.println("Health : " + this.getPlayer().getHealth());
        return true;
    }
}
