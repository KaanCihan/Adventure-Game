public class GameChar {
    private int damage;
    private int health;
    private int money;
    private int defence;
    private String charName;
    private boolean winCondition;

    private int maxHealth;

    public GameChar(int damage, int health, int money, String charName, int maxHealth, int defence) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.charName = charName;
        this.maxHealth = maxHealth;
        this.defence = defence;
        this.winCondition = false;

    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
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

    public void printStats() {
        System.out.println("Damage : " + getDamage());
        System.out.println("Health : " + getHealth());
        System.out.println("Money : " + getMoney());

    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setWinCondition(boolean winCondition) {
        this.winCondition = winCondition;
    }

    public boolean isWinCondition() {
        return winCondition;
    }
}
