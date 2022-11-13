import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome adventurer!");
        System.out.println("Please enter your adventurer name :");
        String playerName = input.nextLine();
        Inventory inventory = new Inventory();
        Player player = new Player(playerName, inventory);
        player.charSelection();
        System.out.println(player.getHealth());
        while(!(player.getHealth() <= 0)){

            player.selectLocation();
            if(!(player.getHealth() <= 0) && player.isWinCondition()){
                System.out.println("-----------------------------------------");
                System.out.println("\t* Congratulations adventurer!!! *");
                System.out.println("-----------------------------------------");
                break;
            }
        }
        if (player.getHealth() <= 0){
            System.out.println("you have died...");
            System.out.println("---------------------");
            System.out.println("\t* GAME OVER *");
            System.out.println("---------------------");
        }
    }
}
