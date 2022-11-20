
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    boolean water;
    boolean food;
    boolean firewood;
    int weaponDamage;
    int armorDefence;

    public Inventory() {
        this.water = false;
        this.food = false;
        this.firewood = false;
        this.weaponDamage = 0;
        this.armorDefence = 0;

    }

    List<String> invWin = new ArrayList<String>();

    List<String> invArmors = new ArrayList<String>();

    List<String> invWeapons = new ArrayList<String>();


    public void randomItem(){

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


    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }


    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void printInv(){
        System.out.println("Unique Items : " + invWin);
        System.out.println("Armors : " + invArmors );
        System.out.println("Weapons : " + invWeapons);
    }
}
