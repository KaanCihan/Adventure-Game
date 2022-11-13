public class SafeHouse extends safeLocation {

    public SafeHouse(Player player,Inventory inventory) {
        super(player, "Safe House", inventory);
    }


    @Override
    public void onLocation() {
        if(getInventory().firewood && getInventory().food && getInventory().water){
            getPlayer().setWinCondition(true);
            return;
        }
        System.out.println("You are fully healed!!");
        getPlayer().setHealth(getPlayer().getMaxHealth());
        System.out.println("Health : " + getPlayer().getHealth());

    }
}
