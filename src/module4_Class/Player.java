package module4_Class;

public class Player {

    /*
     * TODO 2: Declare three attributes with the following name and type.
     * playerName : String
     * hitPoint : int
     * alive : boolean
     */
    String playerName;
    int hitPoint;
    boolean alive;

    /*
     * TODO 3: Declare and define two constructors as specified below.
     * Player(playerName: String, hitPoint: int)
     * 		Initialize playerName and hitPoint attributes of the player object using the
     * 		arguments provided through the constructor. Initialize alive attribute to true.
     *
     * Player(playerName: String)
     * 		Initialize playerName of the player object using the argument provided through
     * 		the constructor. Initialize hitPoint attribute to 100 and alive attribute to true.
     * 		Use this() keyword for constructor chaining.
     */
    Player(String playerName, int hitPoint) {
        this.playerName = playerName;
        this.hitPoint = hitPoint;
        alive = true;
    }

    Player(String playerName) {
        this(playerName, 100);
    }

    /*
     * TODO 4: Declare and define two methods as specified below.
     * getHit(damage: int) : void
     * 		subtract the damage from the player hitPoint. If hitPoint goes below zero, reassign
     * 		hitPoint to zero and make player dead by assigning false to alive attribute.
     *
     * isAlive() : boolean
     * 		this method should return the value of alive attribute.
     */
    void getHit(int damage) {
        this.hitPoint -= damage;
        if (this.hitPoint <= 0) {
            this.hitPoint = 0;
            alive = false;
        }
    }

    boolean isAlive() {
        return this.alive;
    }

}