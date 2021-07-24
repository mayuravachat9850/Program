package Home_Encapsulation;

public class Game {
    /*
     * TODO 6: Provide two attributes, player1 and player2, of type Player.
     * Make both of them private.
     */
    private Player player1;
    private Player player2;
    
    public Game(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void start() {
        System.out.println(this.player1.getName() + " started playing.");
        System.out.println(this.player2.getName() + " started playing.");
    }
}

