package module4_Class;

public class Dog {
    String name;
    String owner;
    boolean male;

    /*
     * TODO 1: Declare and define two constructor as specified below.
     *
     * Dog(name: String, owner: String, male: boolean)
     * 		Initialize the name, owner and male attributes using the constructor arguments.
     *
     * Dog(dog: Dog)
     * 		It's a copy constructor. Initialize the attributes with the same values as the dog
     * 		argument.
     */
    public Dog(String name,String owner,boolean male){
        this.name=name;
        this.owner=owner;
        this.male=male;
    }

    public Dog(Dog dog){
        this.name = dog.name;
        this.owner = dog.owner;
        this.male = dog.male;
    }
}

