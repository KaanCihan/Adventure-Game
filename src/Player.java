import java.util.Scanner;

public class Player {
    private Scanner input = new Scanner(System.in);

    Inventory inventory;
    private int damage;
    private int health;
    private int money;
    private int defence;

    private int maxHealth;
    private String name;
    private String charName;


    public Player(String name) {

        this.name = name;
    }

    public void charSelection() {

        System.out.println(" Knight - | Damage : 8 | \t | Health : 24 | \t | Money : 5 |");
        System.out.println(" Archer - | Damage : 7 | \t | Health : 18 | \t | Money : 20 |");
        System.out.println("Samurai - | Damage : 5 | \t | Health : 21 | \t | Money : 15 |");
        System.out.println("Please choose one of them :");
        String name = input.nextLine();
        switch (name) {
            case "Archer":
                initPlayer(new Archer());
                break;
            case "Knight":
                initPlayer(new Knight());
                break;
            case "Samurai":
                initPlayer(new Samurai());
                break;


        }


    }

    public void selectLocation() {
        System.out.println("Where do you want to go now?");
        System.out.println("1-Store\n2-Safe House\n3-Cave");

        int choose = input.nextInt();
        switch (choose) {
            case 1:
                Location store = new Store(this);
                store.onLocation();
            case 2:
                Location safeHouse = new SafeHouse(this);
                safeHouse.onLocation();
            case 3:
                Location cave = new Cave(this);
                cave.onLocation();
                case 4:
        }
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getCharName());
        this.setMaxHealth(gameChar.getMaxHealth());
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
}
