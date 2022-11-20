public class Storage extends Location {

    public Storage(Player player, Inventory inventory) {
        super(player, "Storage", inventory);
    }

    @Override
    public void onLocation() {
        getInventory().printInv();
        System.out.println("1- Equip Item\n2-Exit ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1- Equip Armor\n2- Equip Weapon");
                int choice2 = input.nextInt();

                switch (choice2) {
                    case 1:
                        System.out.println("write the name of the armor you want to equip.");
                        String armor = input.next();
                        if (getInventory().invArmors.contains(armor)) {
                            getInventory().invArmors.add(getPlayer().getArmor());
                            getInventory().invArmors.remove(armor);
                            getPlayer().setArmor(armor);
                            if(armor.equals("soft")){
                                getPlayer().setDefence(1);
                            }
                            if(armor.equals("mid")){
                                getPlayer().setDefence(3);
                            }
                            if(armor.equals("heavy")){
                                getPlayer().setDefence(5);
                            }
                        }else{
                            System.out.println("you don't have that item.");
                        }
                        break;

                    case 2:
                        System.out.println("write the name of the weapon you want to equip.");
                        String weapon = input.next();
                        if (getInventory().invWeapons.contains(weapon)) {
                            getInventory().invWeapons.add(getPlayer().getWeapon());
                            getInventory().invWeapons.remove(weapon);
                            getPlayer().setWeapon(weapon);
                            if(weapon.equals("soft")){
                                getPlayer().setDamage(getPlayer().getBaseDamage() + 2);
                            }
                            if(weapon.equals("mid")){
                                getPlayer().setDamage(getPlayer().getBaseDamage() + 3);
                            }
                            if(weapon.equals("rifle")){
                                getPlayer().setDamage(getPlayer().getBaseDamage() + 7);
                            }
                        }else{
                            System.out.println("you don't have that item.");
                        }
                        break;
                }

            case 2:
                return;

        }

    }
}
