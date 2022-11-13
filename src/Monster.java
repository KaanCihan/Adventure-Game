public class Monster {
    private int id;
    private int damage;
    private String name;
    private int health;
    private int money;
    private int maxHealth;
    private int award;

    public Monster(int id, String name, int damage, int health, int money, int maxHealth, int award) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        this.maxHealth = maxHealth;
        this.award = award;
    }

    public static Monster[] monsters() {
        Monster[] monstersList = new Monster[3];
        monstersList[0] = new Monster(1, "Zombie", 3, 10, 4, 10, 1);
        monstersList[1] = new Monster(2, "Vampire", 4, 14, 7, 14, 2);
        monstersList[2] = new Monster(3, "Bear", 7, 20, 12, 20, 3);
        return monstersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getAward() {
        return award;
    }
}
