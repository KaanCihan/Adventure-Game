public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Weapon(String name, int damage, int price,int id) {
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.id = id;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponsList = new Weapon[3];
        weaponsList[0] = new Weapon("Pistol",2,25,1);
        weaponsList[1] = new Weapon("Sword",3,35,2);
        weaponsList[2] = new Weapon("Rifle",7,45,3);
        return weaponsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
