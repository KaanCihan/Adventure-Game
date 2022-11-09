public class Armor {
    private String name;
    private int id;
    private int defence;
    private int price;

    public Armor(String name, int defence, int price,int id) {
        this.name = name;
        this.defence = defence;
        this.price = price;
        this.id = id;
    }

    public static Armor[] armors(){
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor("Soft",1,15,1);
        armorList[1] = new Armor("Mid",3,25,2);
        armorList[2] = new Armor("Heavy",5,40,3);
        return armorList;
    }
    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
