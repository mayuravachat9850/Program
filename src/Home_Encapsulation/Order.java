package Home_Encapsulation;

public class Order {
    /*
     * TODO 1: Provide a id attribute of type int. Make it private.
     *  TODO 2: Provide a name attribute of type String. Make it private.
     *   TODO 3: Provide a public constructor which takes two arguments, first one of
     *          type int and second one to type String. Use these two arguments to initialize
     *          id and name attributes of the class.
     *      TODO 4: Provide getters and setters for the id and name attributes.
     */
    private int id;
    private String name;

    public Order(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

