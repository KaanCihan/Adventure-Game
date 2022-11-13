import java.util.Scanner;

public abstract  class Location {
    private Player player;
    private Inventory inventory;
    private String name;
    public Location(Player player,String name,Inventory inventory){
        this.player = player;
        this.name = name;
        this.inventory = inventory;
    }
    protected Scanner input = new Scanner(System.in);
    public abstract void onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
