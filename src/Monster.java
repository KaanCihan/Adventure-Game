public class Monster {
    private int id;
    private int damage;
    private String name;
    private int health;
    private int money;

    public Monster(int id, String name, int damage, int health, int money) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
    }

    public static Monster[] monsters() {
        Monster[] monstersList = new Monster[3];
        monstersList[0] = new Monster(1, "Zombie", 3, 10, 4);
        monstersList[1] = new Monster(2, "Vampire", 4, 14, 7);
        monstersList[2] = new Monster(3, "Bear", 7, 20, 12);
        return monstersList;
    }
    public void initMonster(Monster monster) {
        this.setId(monster.getId());
        this.setName(monster.getName());
        this.setDamage(monster.getDamage());
        this.setHealth(monster.getHealth());
        this.setMoney(monster.getMoney());

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


}
