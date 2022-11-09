public abstract class dangerousLocation extends Location {
    Monster monster;
    public dangerousLocation(Player player, String name, Inventory inventory) {
        super(player, name, inventory);
    }

    @Override
    public boolean onLocation() {
        combat(0);
        return true;
    }

    public void combat(int k) {
        Monster[] monster = Monster.monsters();
        Monster m = monster[k];
        int random = (int) (Math.random() * 3);

        if (random < 1) {
            System.out.println("suddenly a " + m.getName() + " appeared in front of you.");
            switch (k) {
                case 1:
                    Monster monsterEnemy = new Monster(1, "Zombie", 3, 10, 4);
                    break;
                case 2:
                    Monster monsterEnemy = new Monster(1, "Zombie", 3, 10, 4);
                    break;
                case 3:
                    Monster monsterEnemy = new Monster(1, "Zombie", 3, 10, 4);
                    break;


            }
            while(getPlayer().getHealth() > 0 && monsterEnemy.getHealth() > 0){
            getPlayer().setHealth(hitMonster(monsterEnemy,k));
                monsterEnemy.setHealth(hitPlayer(monsterEnemy,k));
            System.out.println("| your health : " + getPlayer().getHealth() + " | monster's health : " + monsterEnemy.getHealth() + " |");
            }
        } else if (random < 2) {
            System.out.println("suddenly two " + m.getName() + " appeared in front of you.");
            for (int i = 0; i < 2 ;i++){
                while(getPlayer().getHealth() > 0 && monsterEnemy.getHealth() > 0){
                    getPlayer().setHealth(hitMonster(monsterEnemy,k));
                    monsterEnemy.setHealth(hitPlayer(monsterEnemy,k));
                    System.out.println("| your health : " + getPlayer().getHealth() + " | monster's health : " + monsterEnemy.getHealth()+ " |");
                }
            }
        } else if (random < 3) {
            System.out.println("suddenly three " + m.getName() + " appeared in front of you.");
            for (int i = 0; i < 3 ;i++){
                while(getPlayer().getHealth() > 0 && monsterEnemy.getHealth() > 0){
                    getPlayer().setHealth(hitMonster(monsterEnemy,k));
                    monsterEnemy.setHealth(hitPlayer(monsterEnemy,k));
                    System.out.println("| your health : " + getPlayer().getHealth() + " | monster's health : " + monsterEnemy.getHealth()+ " |");
                }
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

    public int hitMonster(Monster m, int k) {
        Monster[] monster = Monster.monsters();
        m = monster[k];

        return getPlayer().getHealth() - m.getDamage();
    }

    public int hitPlayer(Monster m, int k) {
        Monster[] monster = Monster.monsters();
        m = monster[k];

        return m.getHealth() - getPlayer().getDamage();
    }
}
