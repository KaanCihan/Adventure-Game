public class Inventory {
    boolean water;
    boolean food;
    boolean firewood;
    int weaponCode;
    int armorCode;
    int weaponDamage;
    int armorDefence;

    public Inventory(boolean water,boolean firewood,boolean food) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isWater() {
        return water;
    }

    public boolean isfood() {
        return food;
    }

    public boolean isFirewood() {
        return firewood;
    }
}
