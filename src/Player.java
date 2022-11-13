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


    public Player(String name, Inventory inventory) {

        this.name = name;
        this.inventory = inventory;
    }


    public void charSelection() {

        System.out.println("1- Knight - | Damage : 8 | \t | Health : 24 | \t | Money : 5 |");
        System.out.println("2- Archer - | Damage : 7 | \t | Health : 18 | \t | Money : 20 |");
        System.out.println("3- Samurai - | Damage : 5 | \t | Health : 21 | \t | Money : 15 |");
        System.out.println("Please choose one of them :");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> initPlayer(new Knight());
            case 2 -> initPlayer(new Archer());
            case 3 -> initPlayer(new Samurai());
        }


    }
    public void selectInventory(){

    }
    public void selectLocation() {
        if (inventory.firewood && inventory.food && inventory.water) {
            System.out.println("you collected all rewards. visit safe location to win the game.");
        }
        System.out.println("Where do you want to go now?");
        System.out.println("1-Store\n2-Safe House\n3-Cave\n4-Forest\n5-River\n6-Mine");

        int choose = input.nextInt();
        switch (choose) {
            case 1:
                Location store = new Store(this, inventory);
                store.onLocation();
                break;
            case 2:
                Location safeHouse = new SafeHouse(this, inventory);
                safeHouse.onLocation();
                break;
            case 3:
                Location cave = new Cave(this, inventory);
                if (!getInventory().isfood()) {
                    cave.onLocation();
                } else {
                    System.out.println("you have killed the all monsters in this area.");
                }
                break;
            case 4:
                Location forest = new Forest(this, inventory);
                if (!getInventory().isFirewood()) {
                    forest.onLocation();
                } else {
                    System.out.println("you have killed the all monsters in this area.");
                }
                break;
            case 5:
                Location river = new River(this, inventory);
                if (!getInventory().isWater()) {
                    river.onLocation();
                } else {
                    System.out.println("you have killed the all monsters in this area.");
                }
                break;
            case 6:
                Location mine = new Mine(this, inventory);
                mine.onLocation();

        }
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getCharName());
        this.setMaxHealth(gameChar.getMaxHealth());
        this.setWinCondition(gameChar.isWinCondition());
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
}
