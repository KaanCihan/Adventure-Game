public class Store extends safeLocation {

    public Store(Player player, Inventory inventory) {

        super(player, "Store",inventory);
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the shop adventurer!");
        System.out.println("What do you want to buy?");
        System.out.println("1 - Weapons \n2 - Armors \n3 - Exit");
        int choice = input.nextInt();
        if (choice == 1) {
            Weapon[] weapons = Weapon.weapons();
            printWeapons();
            System.out.println("Which one of them you want to buy?");
            getPlayer().printMoney();
            choice = input.nextInt();

            if (choice == 1) {
                if (weapons[0].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    return onLocation();
                } else {
                    System.out.println("You have successfully bought the item.");

                    getPlayer().setDamage(getPlayer().getDamage() + weapons[0].getDamage());
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[0].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");

                }
            }
            if (choice == 2) {
                if (weapons[1].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    return onLocation();
                } else {
                    System.out.println("You have successfully bought the item.");
                    getPlayer().setDamage(getPlayer().getDamage() + weapons[1].getDamage());
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[1].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");

                }
            }

            if (choice == 3) {
                if (weapons[2].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    return onLocation();
                } else {
                    System.out.println("You have successfully bought the item.");
                    getPlayer().setDamage(getPlayer().getDamage() + weapons[2].getDamage());
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[2].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");

                }
            }


        } else if (choice == 2) {
            Armor[] armors = Armor.armors();
            printArmors();
            System.out.println("Which one of them you want to buy?");
            System.out.println("* you have " + getPlayer().getMoney() + " coins. *");
            choice = input.nextInt();

            if (choice == 1) {

                if (armors[0].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    return onLocation();
                } else {
                    System.out.println("You have successfully bought the item.");
                    getPlayer().setDefence(armors[0].getDefence());
                    getPlayer().setMoney(getPlayer().getMoney() - armors[0].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");

                }
            } else if (choice == 2) {
                if (armors[1].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    return onLocation();
                } else {
                    System.out.println("You have successfully bought the item.");
                    getPlayer().setDefence(armors[1].getDefence());
                    getPlayer().setMoney(getPlayer().getMoney() - armors[1].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");
                }
            } else if (choice == 3) {
                if (armors[2].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    return onLocation();
                } else {
                    System.out.println("You have successfully bought the item.");
                    getPlayer().setDefence(armors[2].getDefence());
                    getPlayer().setMoney(getPlayer().getMoney() - armors[2].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");
                }

            }
        } else if (choice == 3) {
            return true;
        }

        return true;
    }


    public void printArmors() {
        Armor[] armors = Armor.armors();
        for (int i = 0, armorsLength = armors.length; i < armorsLength; i++) {
            Armor a = armors[i];
            System.out.println("---------");
            System.out.println("Armor ID : " + a.getId());
            System.out.println("Armor name : " + a.getName());
            System.out.println("Defence : " + a.getDefence());
            System.out.println("Price : " + a.getPrice());
        }

    }

    public void printWeapons() {
        for (Weapon w : Weapon.weapons()) {
            System.out.println("---------");
            System.out.println("Armor ID : " + w.getId());
            System.out.println("Weapon name : " + w.getName());
            System.out.println("Damage : " + w.getDamage());
            System.out.println("Price : " + w.getPrice());

        }

    }

}


