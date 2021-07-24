package Home_Encapsulation;

public class Order_Source {
    public static void main(String[] args) {
        Order order = new Order(1, "Apple Watch");
        System.out.println("id: " + order.getId() + ", name: " + order.getName());
    }
}
