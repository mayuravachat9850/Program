package module4_Class;

public class Source {
    public static void main(String[] args) {
        Player player = getPlayer("Harry", 1000);

        System.out.println(player.isAlive());
        System.out.println(player.hitPoint);

        player.getHit(500);
        player.getHit(200);
        player.getHit(400);

        System.out.println(player.isAlive());
        System.out.println(player.hitPoint);
    }

    /*
     * TODO 5: Complete the getPlayer() method. This method should return a Player object
     * which is initialized with playerName and hitPoint.
     */
    static Player getPlayer(String playerName, int hitPoint) {
        return new Player(playerName, hitPoint);
    }
}
