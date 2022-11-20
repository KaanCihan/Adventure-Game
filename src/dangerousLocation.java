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
                giveReward();
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
                giveReward();
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
                giveReward();
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
                giveReward();
        }
    }

    public void giveReward() {
        if (monster.getAward() == 1 && !getInventory().invWin.contains("food")) {
            getInventory().invWin.add("food");
            System.out.println("you gained the food item");
        } else if (monster.getAward() == 2 && !getInventory().invWin.contains("firewood")) {
            getInventory().invWin.add("firewood");
            System.out.println("you gained the firewood item.");
        } else if (monster.getAward() == 3 && !getInventory().invWin.contains("water")) {
            getInventory().invWin.add("water");
            System.out.println("you gained the water item.");
        } else if (monster.getAward() == 4) {
            double random = (double) Math.random() * 10;
            double random2 = (double) Math.random() * 10;
            if (random <= 1.5) {
                if (random2 <= 2) {
                    getInventory().invWeapons.add("rifle");
                    System.out.println("you have found a rifle.");
                } else if (random2 <= 5) {
                    getInventory().invWeapons.add("sword");
                    System.out.println("you have found a sword");
                } else if (random2  <= 10){
                    getInventory().invWeapons.add("pistol");
                    System.out.println("you have found a pistol");
                }
            } else if (random <= 3) {
                if (random2 <= 2) {
                    getInventory().invArmors.add("soft");
                    System.out.println("you have found a soft armor.");
                } else if (random2 <= 5) {
                    getInventory().invArmors.add("mid");
                    System.out.println("you have found a mid armor");
                } else if (random2  <= 10){
                    getInventory().invArmors.add("heavy");
                    System.out.println("you have found a heavy armor");
                }
            } else if (random <= 5.5) {
                if (random2 <= 2) {
                    getPlayer().setMoney(getPlayer().getMoney() + 10);
                } else if (random2 <= 5) {
                    getPlayer().setMoney(getPlayer().getMoney() + 5);
                } else if (random2  <= 10){
                    getPlayer().setMoney(getPlayer().getMoney() + 1);
                }

            } else if (random <= 10) {
                return;
            }
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

        int armor = getPlayer().getDefence();
        if (armor > monster.getDamage()) {
            armor = monster.getDamage();
        }
        return getPlayer().getHealth() - (monster.getDamage() - armor);
    }

    public int hitPlayer() {


        return monster.getHealth() - getPlayer().getDamage();
    }
}
