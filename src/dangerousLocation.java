public abstract class dangerousLocation extends Location {
    protected Monster monster;

    public dangerousLocation(Player player, String name, Inventory inventory, Monster monster) {
        super(player, name, inventory);
        this.monster = monster;
    }


    public void combat(int k) {

        int random = (int) (Math.random() * 3);
        if (random < 1) {
            System.out.println("suddenly a " + monster.getName() + " appeared in front of you.");
            System.out.println("* a " + monster.getName() + " attacks you. *");
            while (getPlayer().getHealth() > 0 && monster.getHealth() > 0) {
                getPlayer().setHealth(hitMonster());
                monster.setHealth(hitPlayer());
                System.out.println("| your health : " + getPlayer().getHealth() + " | monster's health : " + monster.getHealth() + " |");
            }
            if (getPlayer().getHealth() > 0) {
                getPlayer().setMoney(getPlayer().getMoney() + monster.getMoney());
                System.out.println("* you have killed a " + monster.getName() + " and now you have " + getPlayer().getMoney() + " coins *");
                monster.setHealth(monster.getMaxHealth());
            }

            if (getPlayer().getHealth() > 0)
                giveAward();
        } else if (random < 2) {
            System.out.println("suddenly two " + monster.getName() + " appeared in front of you.");

            for (int i = 0; i < 2; i++) {
                System.out.println("* a " + monster.getName() + " attacks you. *");
                while (getPlayer().getHealth() > 0 && monster.getHealth() > 0) {
                    getPlayer().setHealth(hitMonster());
                    monster.setHealth(hitPlayer());
                    System.out.println("| your health : " + getPlayer().getHealth() + " | monster's health : " + monster.getHealth() + " |");
                }
                if (getPlayer().getHealth() > 0) {
                    getPlayer().setMoney(getPlayer().getMoney() + monster.getMoney());
                    System.out.println("* you have killed a " + monster.getName() + " and now you have " + getPlayer().getMoney() + " coins *");
                    monster.setHealth(monster.getMaxHealth());
                }
            }
            if (getPlayer().getHealth() > 0)
                giveAward();
        } else if (random < 3) {
            System.out.println("suddenly three " + monster.getName() + " appeared in front of you.");

            for (int i = 0; i < 3; i++) {
                System.out.println("* a " + monster.getName() + " attacks you. *");
                while (getPlayer().getHealth() > 0 && monster.getHealth() > 0) {
                    getPlayer().setHealth(hitMonster());
                    monster.setHealth(hitPlayer());
                    System.out.println("| your health : " + getPlayer().getHealth() + " | monster's health : " + monster.getHealth() + " |");
                }
                if (getPlayer().getHealth() > 0) {
                    getPlayer().setMoney(getPlayer().getMoney() + monster.getMoney());
                    System.out.println("* you have killed a " + monster.getName() + " and now you have " + getPlayer().getMoney() + " coins *");
                    monster.setHealth(monster.getMaxHealth());
                }

            }
            if (getPlayer().getHealth() > 0)
                giveAward();
        }

    }

    public void snakeCombat() {
        for (int i = 0; i < (Math.random() * 4) + 1; i++) {
            while (getPlayer().getHealth() > 0 && monster.getHealth() > 0) {
                getPlayer().setHealth(hitMonster());
                monster.setHealth(hitPlayer());
                System.out.println("| your health : " + getPlayer().getHealth() + " | monster's health : " + monster.getHealth() + " |");
            }
            if (getPlayer().getHealth() > 0) {
                getPlayer().setMoney(getPlayer().getMoney() + monster.getMoney());
                System.out.println("* you have killed a " + monster.getName());
                monster.setHealth(monster.getMaxHealth());
            }
            if (getPlayer().getHealth() > 0)
                giveAward();
        }
    }

    public void giveAward() {
        if (monster.getAward() == 1 && !getInventory().isfood()) {
            getInventory().setFood(true);
            System.out.println("you gained the food item");
        } else if (monster.getAward() == 2 && !getInventory().isFirewood()) {
            getInventory().setFirewood(true);
            System.out.println("you gained the firewood item.");
        } else if (monster.getAward() == 3 && !getInventory().isWater()) {
            getInventory().setWater(true);
            System.out.println("you gained the water item.");
        } else if (monster.getAward() == 4) {

        }
    }

    public boolean isWin(int k) {
        Monster[] monster = Monster.monsters();
        Monster m = monster[k];
        if (getPlayer().getHealth() <= 0) {

            return true;
        }
        if (m.getHealth() <= 0) {
            System.out.println("you have killed the " + m.getName());
            return false;
        }
        return false;
    }

    public int hitMonster() {

        int armor = getInventory().getArmorDefence();
        if (armor > monster.getDamage()) {
            armor = monster.getDamage();
        }
        return getPlayer().getHealth() - (monster.getDamage() - armor);
    }

    public int hitPlayer() {


        return monster.getHealth() - getPlayer().getDamage() - getInventory().getWeaponDamage();
    }
}
