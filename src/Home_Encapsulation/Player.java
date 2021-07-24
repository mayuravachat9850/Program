package Home_Encapsulation;

public class Player {
    /*
     * TODO 1: Provide a maxHealth attribute of type int. Make it static and private.
     *  TODO 2: Provide a name attribute of type String. Make it private.
     *   TODO 3: Provide a currentHealth attribute of type int. Make it private.
     *    TODO 4: Provide a static initializer block and initialize maxHealth to 100.
     *     TODO 5: Provide a public constructor which take one argument of type String.
     *          Use this argument to initialize player name. Initialize currentHealth to maxHealth.
     *      TODO 6: Provide getters and setters for the name and currentHealth attributes.
     */
    private static int maxHealth;
    private String name;
    private int currentHealth;

    static {
        maxHealth = 100;
    }


    public Player(String name) {
        this.name = name;
        this.currentHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
}

