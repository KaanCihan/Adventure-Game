import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);

    private Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private int defence;

    private int maxHealth;
    private boolean winCondition;
    private String name;
    private String charName;

    private int baseDamage;
    private String armor;
    private String weapon;

    public Player(String name, Inventory inventory) {

        this.name = name;
        this.inventory = inventory;
    }


    public void charSelection() {

        System.out.println("1- Knight - | Damage : 8 | \t | Health : 24 | \t | Money : 5 |");
        System.out.println("2- Archer - | Damage : 7 | \t | Health : 18 | \t | Money : 20 |");
        System.out.println("3-Samurai - | Damage : 5 | \t | Health : 21 | \t | Money : 15 |");
        System.out.println("Please choose one of them :");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> initPlayer(new Knight());
            case 2 -> initPlayer(new Archer());
            case 3 -> initPlayer(new Samurai());
        }


    }

    public void selectLocation() {
        if (inventory.firewood && inventory.food && inventory.water) {
            System.out.println("you collected all rewards. visit safe location to win the game.");
        }
        System.out.println("Where do you want to go now?");
        System.out.println("1-Storage\n2-Store\n3-Safe House\n4-Cave\n5-Forest\n6-River\n7-Mine");

        int choose = input.nextInt();
        switch (choose) {
            case 1:
                Location storage = new Storage(this, inventory);
                storage.onLocation();

                break;
            case 2:
                Location store = new Store(this, inventory);
                store.onLocation();

                break;
            case 3:
                Location safeHouse = new SafeHouse(this, inventory);
                safeHouse.onLocation();
                break;
            case 4:
                Location cave = new Cave(this, inventory);
                if (!getInventory().invWin.contains("food")) {
                    cave.onLocation();
                    if (getInventory().invWin.contains("firewood") && getInventory().invWin.contains("food") && getInventory().invWin.contains("water")){
                        System.out.println("\nyou have collected the all necessary items . return safe house to win the game.\n");
                    }
                } else {
                    System.out.println("you have killed the all monsters in this area.");
                }
                break;
            case 5:
                Location forest = new Forest(this, inventory);
                if (!getInventory().invWin.contains("firewood")) {
                    forest.onLocation();
                    if (getInventory().invWin.contains("firewood") && getInventory().invWin.contains("food") && getInventory().invWin.contains("water")){
                        System.out.println("\nyou have collected the all necessary items . return safe house to win the game.\n");
                    }
                } else {
                    System.out.println("you have killed the all monsters in this area.");
                }
                break;
            case 6:
                Location river = new River(this, inventory);
                if (!getInventory().invWin.contains("water")) {
                    river.onLocation();
                    if (getInventory().invWin.contains("firewood") && getInventory().invWin.contains("food") && getInventory().invWin.contains("water")){
                        System.out.println("\nyou have collected the all necessary items . return safe house to win the game.\n");
                    }
                } else {
                    System.out.println("you have killed the all monsters in this area.");
                }
                break;
            case 7:
                Location mine = new Mine(this, inventory);
                mine.onLocation();
                if (getInventory().invWin.contains("firewood") && getInventory().invWin.contains("food") && getInventory().invWin.contains("water")){
                    System.out.println("\nyou have collected the all necessary items . return safe house to win the game.\n");
                }

        }
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getCharName());
        this.setMaxHealth(gameChar.getMaxHealth());
        this.setWinCondition(gameChar.isWinCondition());
        this.setBaseDamage(gameChar.getBaseDamage());
        this.setArmor(gameChar.getArmor());
        this.setWeapon(gameChar.getWeapon());
        gameChar.printStats();
    }

    public void printMoney() {
        System.out.println("* you have " + getMoney() + " coins. *");
    }


    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {

        this.damage = damage;
    }

    public int getHealth() {

        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setWinCondition(boolean winCondition) {
        this.winCondition = winCondition;
    }

    public boolean isWinCondition() {
        return winCondition;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }
}
