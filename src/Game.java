import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Welcome adventurer!");
        System.out.println("Please enter your adventurer name :");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        player.charSelection();
        player.setHealth(15);
        System.out.println(player.getHealth());
        player.selectLocation();


    }
}
