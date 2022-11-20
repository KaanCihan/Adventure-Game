public class Store extends safeLocation {

    public Store(Player player, Inventory inventory) {

        super(player, "Store", inventory);
    }

    @Override
    public void onLocation() {
        System.out.println("Welcome to the shop adventurer!");
        System.out.println("What do you want to buy?");
        System.out.println("1 - Weapons \n2 - Armors \n3 - Sell Item\n4 - Exit");
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
                    onLocation();

                } else {
                    System.out.println("You have successfully bought the item.");
                    getInventory().invWeapons.add("pistol");
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[0].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");

                }
            }
            if (choice == 2) {
                if (weapons[1].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    onLocation();

                } else {
                    System.out.println("You have successfully bought the item.");
                    getInventory().invWeapons.add("sword");
                    getPlayer().setMoney(getPlayer().getMoney() - weapons[1].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");

                }
            }

            if (choice == 3) {
                if (weapons[2].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    onLocation();

                } else {
                    System.out.println("You have successfully bought the item.");
                    getInventory().invWeapons.add("rifle");
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
                    onLocation();

                } else {
                    System.out.println("You have successfully bought the item.");
                    getInventory().invArmors.add("soft");
                    getPlayer().setMoney(getPlayer().getMoney() - armors[0].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");

                }
            } else if (choice == 2) {
                if (armors[1].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    onLocation();

                } else {
                    System.out.println("You have successfully bought the item.");
                    getInventory().invArmors.add("mid");
                    getPlayer().setMoney(getPlayer().getMoney() - armors[1].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");
                }
            } else if (choice == 3) {
                if (armors[2].getPrice() > getPlayer().getMoney()) {
                    System.out.println("You don't have enough money.");
                    System.out.println("-----------");
                    onLocation();

                } else {
                    System.out.println("You have successfully bought the item.");
                    getInventory().invArmors.add("heavy");
                    getPlayer().setMoney(getPlayer().getMoney() - armors[2].getPrice());
                    getPlayer().printMoney();
                    System.out.println("-----------");
                }

            }
        } else if (choice == 3) {
            sellItem();
            onLocation();
        } else if (choice == 4) {
            return;

        }
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


    public void sellItem() {
        Armor[] armors = Armor.armors();
        Weapon[] weapons = Weapon.weapons();
        getInventory().printInv();

        System.out.println("write the name of the item you want to sell.");
        String choice = input.next();

        if (choice.equals("food") || choice.equals("firewood") || choice.equals("water")) {
            System.out.println("you can't sell a unique item.");
        } else if (choice.equals("soft") && getInventory().invArmors.contains("soft")) {
            getInventory().invArmors.remove("soft");
            getPlayer().setMoney(getPlayer().getMoney() + armors[0].getPrice());
        } else if (choice.equals("mid") && getInventory().invArmors.contains("mid")) {
            getInventory().invArmors.remove("mid");
            getPlayer().setMoney(getPlayer().getMoney() + armors[1].getPrice());
        } else if (choice.equals("heavy") && getInventory().invArmors.contains("heavy")) {
            getInventory().invArmors.remove("heavy");
            getPlayer().setMoney(getPlayer().getMoney() + armors[2].getPrice());
        } else if (choice.equals("pistol") && getInventory().invWeapons.contains("pistol")) {
            getInventory().invWeapons.remove("pistol");
            getPlayer().setMoney(getPlayer().getMoney() + weapons[0].getPrice());
        } else if (choice.equals("sword") && getInventory().invWeapons.contains("sword")) {
            getInventory().invWeapons.remove("sword");
            getPlayer().setMoney(getPlayer().getMoney() + weapons[1].getPrice());
        } else if (choice.equals("rifle") && getInventory().invWeapons.contains("rifle")) {
            getInventory().invWeapons.remove("rifle");
            getPlayer().setMoney(getPlayer().getMoney() + weapons[2].getPrice());
        } else {
            System.out.println("you don't have this item.");
        }
        getPlayer().printMoney();



    }

}


